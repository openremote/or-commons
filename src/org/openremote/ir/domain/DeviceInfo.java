/* OpenRemote, the Home of the Digital Home.
* Copyright 2008-2012, OpenRemote Inc.
*
* See the contributors.txt file in the distribution for a
* full listing of individual contributors.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as
* published by the Free Software Foundation, either version 3 of the
* License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package org.openremote.ir.domain;

import java.io.Serializable;

/**
 * allows to share xcfFileParser.device necessary information with the client
 * side
 * 
 * @author wbalcaen
 * 
 */
public class DeviceInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  private BrandInfo brandInfo;
  private String modelName;

  public DeviceInfo() {
  }

  public DeviceInfo(BrandInfo brand, String modelName) {
    setBrandInfo(brand);
    setModelName(modelName);
  }

  public BrandInfo getBrandInfo() {
    return brandInfo;
  }

  public void setBrandInfo(BrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

}
