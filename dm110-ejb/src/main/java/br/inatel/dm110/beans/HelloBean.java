package br.inatel.dm110.beans;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.hello.interfaces.Hello;
import br.inatel.dm110.hello.interfaces.HelloLocal;
import br.inatel.dm110.hello.interfaces.HelloRemote;

@Stateless
@Remote(HelloRemote.class)
@Local(HelloLocal.class)
public class HelloBean implements Hello{

	@Override
	public String sayHello(String name) {
		System.out.println("Inside EJB!");
		return "Say hello to " + name + " from EJB!!";
	}

	
}
