/*
 * Copyright 2015 Fernando Ribeiro
 * 
 * This file is part of ActiveMQ Extension.
 *
 * ActiveMQ Extension is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * ActiveMQ Extension is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with ActiveMQ Extension. If not, see <http://www.gnu.org/licenses/>.
 */
package br.eti.fernandoribeiro.nlogo.activemq;

import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.PrimitiveManager;

public final class ActiveMQExtension extends DefaultClassManager {

	@Override
	public void load(final PrimitiveManager primManager) {
		primManager.addPrimitive("close-connection", new CloseConnection());
		primManager.addPrimitive("create-connection", new CreateConnection());
		primManager.addPrimitive("create-connection-factory", new CreateConnectionFactory());
		primManager.addPrimitive("create-consumer", new CreateConsumer());
		primManager.addPrimitive("create-durable-subscriber", new CreateDurableSubscriber());
		primManager.addPrimitive("create-producer", new CreateProducer());
		primManager.addPrimitive("create-queue", new CreateQueue());
		primManager.addPrimitive("create-session", new CreateSession());
		primManager.addPrimitive("create-text-message", new CreateTextMessage());
		primManager.addPrimitive("create-topic", new CreateTopic());
		primManager.addPrimitive("receive-message", new ReceiveMessage());
		primManager.addPrimitive("send-message", new SendMessage());
		primManager.addPrimitive("set-client-id", new SetClientID());
		primManager.addPrimitive("start-connection", new StartConnection());
	}

}