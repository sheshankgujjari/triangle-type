/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics.implementation;

import com.cardlytics.interfaces.ITriangle;
import com.cardlytics.util.Constants;

public class Triangle implements ITriangle {

    /**
     * Calculate the triangle type
     * @param a
     * @param b
     * @param c
     * @return
     */
    public String triangleType(Integer a, Integer b, Integer c) {
        if (a.equals(b) && b.equals(c)) {
            return Constants.Equilateral;
        } else if (!a.equals(b) && !b.equals(c) && !a.equals(c)) {
            return Constants.Scalene;
        } else {
            return Constants.Isosceles;
        }
    }
}
