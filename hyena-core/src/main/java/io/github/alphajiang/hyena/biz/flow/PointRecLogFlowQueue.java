/*
 *  Copyright (C) 2019 Alpha Jiang. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alphajiang.hyena.biz.flow;

import io.github.alphajiang.hyena.ds.service.PointRecLogDs;
import io.github.alphajiang.hyena.model.po.PointRecLogPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class PointRecLogFlowQueue {


    private LinkedBlockingQueue<PointRecLog> queue;

    private PointRecLogFlowConsumer consumer;

    @Autowired
    private PointRecLogDs pointRecLogDs;

    @PostConstruct
    public void init() {
        queue = new LinkedBlockingQueue<>();
        consumer = new PointRecLogFlowConsumer(queue, pointRecLogDs);
        new Thread(consumer).start();
    }

    public boolean offer(PointRecLog pl) {
        return this.queue.offer(pl);
    }

    @Data
    @AllArgsConstructor
    public static class PointRecLog {
        private String type;
        private PointRecLogPo pointRecLog;
    }
}
