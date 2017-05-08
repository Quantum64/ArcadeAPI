package co.q64.arcade.base.api.net.test;

import co.q64.arcade.base.api.annotation.packet.PacketDefinition;
import co.q64.arcade.base.api.net.Packet;

@PacketDefinition(value = "test", request = TestRequest.class, response = TestResponse.class)
public interface TestPacket extends Packet<TestRequest, TestResponse> {}
