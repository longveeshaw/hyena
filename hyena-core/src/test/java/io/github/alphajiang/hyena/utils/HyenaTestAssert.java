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

package io.github.alphajiang.hyena.utils;

import io.github.alphajiang.hyena.model.po.PointLogPo;
import io.github.alphajiang.hyena.model.po.PointPo;
import io.github.alphajiang.hyena.model.po.PointRecLogPo;
import io.github.alphajiang.hyena.model.po.PointRecPo;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class HyenaTestAssert {

    public static void assertEquals(BigDecimal expect, BigDecimal actual) {
        Assertions.assertEquals(expect.doubleValue(), actual.doubleValue());
    }

    public static void assertEquals(PointPo expect, PointPo actual) {
        Assertions.assertEquals(expect.getUid(), actual.getUid());
        Assertions.assertEquals(expect.getName(), actual.getName());
        Assertions.assertEquals(expect.getPoint(), actual.getPoint());
        Assertions.assertEquals(expect.getAvailable(), actual.getAvailable());
        Assertions.assertEquals(expect.getUsed(), actual.getUsed());
        Assertions.assertEquals(expect.getFrozen(), actual.getFrozen());
        Assertions.assertEquals(expect.getRefund(), actual.getRefund());
        Assertions.assertEquals(expect.getExpire(), actual.getExpire());
        Assertions.assertEquals(expect.getCost(), actual.getCost());
        Assertions.assertEquals(expect.getFrozenCost(), actual.getFrozenCost());
        Assertions.assertEquals(expect.getSeqNum(), actual.getSeqNum());
        Assertions.assertEquals(expect.getEnable(), actual.getEnable());

    }

    public static void assertEquals(PointLogPo expect, PointLogPo actual) {
        Assertions.assertEquals(expect.getUid(), actual.getUid());
        Assertions.assertEquals(expect.getType().intValue(), actual.getType().intValue());
        Assertions.assertEquals(expect.getSeqNum(), actual.getSeqNum());
        Assertions.assertEquals(expect.getDelta() , actual.getDelta() );
        Assertions.assertEquals(expect.getDeltaCost() , actual.getDeltaCost() );
        Assertions.assertEquals(expect.getPoint() , actual.getPoint() );
        Assertions.assertEquals(expect.getAvailable() , actual.getAvailable() );
        Assertions.assertEquals(expect.getUsed() , actual.getUsed() );
        Assertions.assertEquals(expect.getFrozen() , actual.getFrozen() );
        Assertions.assertEquals(expect.getExpire() , actual.getExpire() );
        Assertions.assertEquals(expect.getRefund() , actual.getRefund() );
        Assertions.assertEquals(expect.getCost() , actual.getCost() );
        Assertions.assertEquals(expect.getFrozenCost() , actual.getFrozenCost() );

        if (expect.getTag() != null) {
            Assertions.assertEquals(expect.getTag(), actual.getTag());
        }
        if (expect.getOrderNo() != null) {
            Assertions.assertEquals(expect.getOrderNo(), actual.getOrderNo());
        }
        if (expect.getSourceType() != null) {
            Assertions.assertEquals(expect.getSourceType().intValue(), actual.getSourceType().intValue());
        }
        if (expect.getOrderType() != null) {
            Assertions.assertEquals(expect.getOrderType().intValue(), actual.getOrderType().intValue());
        }
        if (expect.getPayType() != null) {
            Assertions.assertEquals(expect.getPayType().intValue(), actual.getPayType().intValue());
        }
        Assertions.assertEquals(expect.getExtra(), actual.getExtra());
        if (expect.getNote() != null) {
            Assertions.assertEquals(expect.getNote(), actual.getNote());
        }
    }

    public static void assertEquals(PointRecPo expect, PointRecPo actual) {

        Assertions.assertEquals(expect.getPid(), actual.getPid());
        Assertions.assertEquals(expect.getSeqNum(), actual.getSeqNum());
        Assertions.assertEquals(expect.getTotal() , actual.getTotal() );
        Assertions.assertEquals(expect.getAvailable() , actual.getAvailable() );
        Assertions.assertEquals(expect.getUsed() , actual.getUsed() );
        Assertions.assertEquals(expect.getFrozen() , actual.getFrozen() );
        Assertions.assertEquals(expect.getCancelled() , actual.getCancelled() );
        Assertions.assertEquals(expect.getExpire() , actual.getExpire() );
        Assertions.assertEquals(expect.getTotalCost() , actual.getTotalCost() );
        Assertions.assertEquals(expect.getFrozenCost() , actual.getFrozenCost() );
        Assertions.assertEquals(expect.getUsedCost() , actual.getUsedCost() );
        Assertions.assertEquals(expect.getRefundCost() , actual.getRefundCost() );

        Assertions.assertEquals(expect.getTag(), actual.getTag());
        Assertions.assertEquals(expect.getOrderNo(), actual.getOrderNo());
        if (expect.getSourceType() != null) {
            Assertions.assertEquals(expect.getSourceType().intValue(), actual.getSourceType().intValue());
        }
        if (expect.getOrderType() != null) {
            Assertions.assertEquals(expect.getOrderType().intValue(), actual.getOrderType().intValue());
        }
        if (expect.getPayType() != null) {
            Assertions.assertEquals(expect.getPayType().intValue(), actual.getPayType().intValue());
        }
        Assertions.assertEquals(expect.getExtra(), actual.getExtra());
        if (expect.getIssueTime() != null) {
            Assertions.assertEquals(expect.getIssueTime(), actual.getIssueTime());
        }
        Assertions.assertEquals(expect.getExpireTime(), actual.getExpireTime());

    }


    public static void assertEquals(PointRecLogPo expect, PointRecLogPo actual) {

        Assertions.assertEquals(expect.getPid(), actual.getPid());
        Assertions.assertEquals(expect.getSeqNum(), actual.getSeqNum());
        Assertions.assertEquals(expect.getRecId(), actual.getRecId());
        Assertions.assertEquals(expect.getType(), actual.getType());
        Assertions.assertEquals(expect.getDelta() , actual.getDelta() );
        Assertions.assertEquals(expect.getAvailable() , actual.getAvailable() );
        Assertions.assertEquals(expect.getUsed() , actual.getUsed() );
        Assertions.assertEquals(expect.getFrozen() , actual.getFrozen() );
        Assertions.assertEquals(expect.getCancelled() , actual.getCancelled() );
        Assertions.assertEquals(expect.getExpire() , actual.getExpire() );
        Assertions.assertEquals(expect.getCost() , actual.getCost() );
        Assertions.assertEquals(expect.getFrozenCost() , actual.getFrozenCost() );
        Assertions.assertEquals(expect.getUsedCost() , actual.getUsedCost() );
        Assertions.assertEquals(expect.getRefundCost() , actual.getRefundCost() );

        if (expect.getSourceType() != null) {
            Assertions.assertEquals(expect.getSourceType().intValue(), actual.getSourceType().intValue());
        }
        if (expect.getOrderType() != null) {
            Assertions.assertEquals(expect.getOrderType().intValue(), actual.getOrderType().intValue());
        }
        if (expect.getPayType() != null) {
            Assertions.assertEquals(expect.getPayType().intValue(), actual.getPayType().intValue());
        }
        if (expect.getNote() != null) {
            Assertions.assertEquals(expect.getNote(), actual.getNote());
        }


    }
}
