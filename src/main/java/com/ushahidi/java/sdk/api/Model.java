/*****************************************************************************
 ** Copyright (c) 2010 - 2012 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 **
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.
 **
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 **
 *****************************************************************************/
package com.ushahidi.java.sdk.api;

/**
 * The Model class representing all the resource the Ushahidi API provides.
 * 
 * @author eyedol
 * 
 */
public abstract class Model {

	/**
	 * Set the ID of the category
	 * 
	 * @param id
	 *            The ID
	 */
	protected abstract void setId(int id);

	/**
	 * Get the ID of the category
	 * 
	 * @return The ID
	 */
	public abstract int getId();
}