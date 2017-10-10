/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics;

import com.cardlytics.implementation.Triangle;
import com.cardlytics.interfaces.ITriangle;
import com.cardlytics.util.TriangleHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sides = new ArrayList<Integer>();
        char prompt = 'a';

        ITriangle triangle = new Triangle();
        System.out.println("Enter the positive integer values for the sides of a triangle in terms of length for a, b, and c.");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Please enter an integer value for " + prompt + ": ");
                String value = br.readLine();
                TriangleHelper.checkValidInteger(value);
                sides.add(Integer.parseInt(value));
                prompt = (char) (prompt + 1);
            }

                String result = triangle.triangleType(sides.get(0), sides.get(1), sides.get(2));
                System.out.println("Triangle type is :" + result);

        } catch (Exception ex) {
            System.out.println("IO exception");
        }
    }
}
