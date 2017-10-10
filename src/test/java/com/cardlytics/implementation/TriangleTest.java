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
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private  ITriangle triangle = new Triangle();

    @Test
    public void testTriangleTypeEquilateral() {
        assertEquals(triangle.triangleType(1, 1, 1), Constants.Equilateral);
    }

    @Test
    public void testTriangleTypeIsosceles() {

        assertEquals(triangle.triangleType(3, 1, 3), Constants.Isosceles);
        assertEquals(triangle.triangleType(1, 3, 3), Constants.Isosceles);
        assertEquals(triangle.triangleType(3, 3, 1), Constants.Isosceles);
    }

    @Test
    public void testTriangleTypeScalene() {

        assertEquals(triangle.triangleType(4, 2, 3), Constants.Scalene);
        assertEquals(triangle.triangleType(2, 4, 3), Constants.Scalene);
        assertEquals(triangle.triangleType(2, 3, 4), Constants.Scalene);
    }

}