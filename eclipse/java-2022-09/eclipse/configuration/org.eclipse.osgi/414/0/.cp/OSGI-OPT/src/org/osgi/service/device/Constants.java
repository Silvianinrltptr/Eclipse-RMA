/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.service.device;

/**
 * This interface defines standard names for property keys associated with
 * {@link Device} and {@link Driver} services.
 * 
 * <p>
 * The values associated with these keys are of type {@code java.lang.String},
 * unless otherwise stated.
 * 
 * @noimplement
 * @author $Id: 4bbe7b4b8219c31f85a0dfc73b3b062a4b63c69e $
 * @since 1.1
 * @see Device
 * @see Driver
 */
public interface Constants {
	/**
	 * Property (named &quot;DRIVER_ID&quot;) identifying a driver.
	 * 
	 * <p>
	 * A {@code DRIVER_ID} should start with the reversed domain name of the
	 * company that implemented the driver (e.g., {@code com.acme}), and must
	 * meet the following requirements:
	 * 
	 * <ul>
	 * <li>It must be independent of the location from where it is obtained.</li>
	 * <li>It must be independent of the {@link DriverLocator} service that
	 * downloaded it.</li>
	 * <li>It must be unique.</li>
	 * <li>It must be different for different revisions of the same driver.</li>
	 * </ul>
	 * 
	 * <p>
	 * This property is mandatory, i.e., every {@code Driver} service must be
	 * registered with it.
	 */
	public static final String	DRIVER_ID			= "DRIVER_ID";
	/**
	 * Property (named &quot;DEVICE_CATEGORY&quot;) containing a human readable
	 * description of the device categories implemented by a device. This
	 * property is of type {@code String[]}
	 * 
	 * <p>
	 * Services registered with this property will be treated as devices and
	 * discovered by the device manager
	 */
	public static final String	DEVICE_CATEGORY		= "DEVICE_CATEGORY";
	/**
	 * Property (named &quot;DEVICE_SERIAL&quot;) specifying a device's serial
	 * number.
	 */
	public static final String	DEVICE_SERIAL		= "DEVICE_SERIAL";
	/**
	 * Property (named &quot;DEVICE_DESCRIPTION&quot;) containing a human
	 * readable string describing the actual hardware device.
	 */
	public static final String	DEVICE_DESCRIPTION	= "DEVICE_DESCRIPTION";
}
