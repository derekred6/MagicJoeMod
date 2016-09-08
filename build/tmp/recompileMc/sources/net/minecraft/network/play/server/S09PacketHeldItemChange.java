package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class S09PacketHeldItemChange implements Packet
{
    private int field_149387_a;
    private static final String __OBFID = "CL_00001324";

    public S09PacketHeldItemChange() {}

    public S09PacketHeldItemChange(int p_i45215_1_)
    {
        this.field_149387_a = p_i45215_1_;
    }

    /**
     * Reads the raw packet data from the data stream.
     */
    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_149387_a = buf.readByte();
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.field_149387_a);
    }

    public void func_180746_a(INetHandlerPlayClient p_180746_1_)
    {
        p_180746_1_.handleHeldItemChange(this);
    }

    @SideOnly(Side.CLIENT)
    public int func_149385_c()
    {
        return this.field_149387_a;
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */
    public void processPacket(INetHandler handler)
    {
        this.func_180746_a((INetHandlerPlayClient)handler);
    }
}