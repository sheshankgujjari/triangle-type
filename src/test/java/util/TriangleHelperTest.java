/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package util;

import com.cardlytics.util.TriangleHelper;
import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleHelperTest {

    @Test
    public void checkValidLength() throws Exception {
        try {
            TriangleHelper.checkValidInteger("5");
        } catch (Exception e){
            assertNull(e);
        }
    }
}