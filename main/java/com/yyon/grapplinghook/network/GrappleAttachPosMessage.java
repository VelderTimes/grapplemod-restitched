package com.yyon.grapplinghook.network;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;


/*
 * This file is part of GrappleMod.

    GrappleMod is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    GrappleMod is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with GrappleMod.  If not, see <http://www.gnu.org/licenses/>.
 */

public class GrappleAttachPosMessage extends BaseMessage {
   
	public int id;
	public double x;
	public double y;
	public double z;

    public GrappleAttachPosMessage(PacketBuffer buf) {
    	super(buf);
    }

    public GrappleAttachPosMessage(int id, double x, double y, double z) {
    	this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void decode(PacketBuffer buf) {
    	this.id = buf.readInt();
        this.x = buf.readDouble();
        this.y = buf.readDouble();
        this.z = buf.readDouble();
    }

    public void encode(PacketBuffer buf) {
    	buf.writeInt(this.id);
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
    }

    public void processMessage(NetworkEvent.Context ctx) {
    	/*
    	World world = Minecraft.getInstance().world;
    	Entity grapple = world.getEntityByID(this.id);
    	if (grapple instanceof grappleArrow) {
        	((grappleArrow) grapple).setAttachPos(message.x, message.y, message.z);
    	}
    	*/
    }
}
