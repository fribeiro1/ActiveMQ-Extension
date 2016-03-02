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

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;

public final class CreateConnection extends DefaultReporter {

	@Override
	public Syntax getSyntax() {
		return Syntax.reporterSyntax(new int[] { Syntax.WildcardType() }, Syntax.WildcardType());
	}

	@Override
	public Object report(final Argument[] args, final Context context) throws ExtensionException, LogoException {

		try {
			return ((ConnectionFactory) args[0].get()).createConnection();
		} catch (final JMSException e) {
			throw new ExtensionException(e);
		}

	}

}