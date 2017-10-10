/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics.util;

public class TriangleHelper {

    /**
     * Check for valid integer
     * @param value
     */
    public static void checkValidInteger(String value) {
        try {
            int i = Integer.parseInt(value);
            if(i<0) {
                System.out.println("Valid positive integer value is not provided");
                System.exit(0);
            }

        } catch (Exception ex) {
            System.out.println("Valid positive integer value is not provided");
            System.out.println("Aborting the process");
            System.exit(0);
        }
    }
}
