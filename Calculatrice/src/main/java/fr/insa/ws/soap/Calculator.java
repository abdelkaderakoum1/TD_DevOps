package fr.insa.ws.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName="Calculator")
public class Calculator{

    // The classes and fields are public so that JAXB puts them in the WSDL
    // (private fields are ignored: the service would receive and return nothing)
    public static class Add{
        public int intA, intB;

    }

    public static class AddResponse{
        public int AddResult;
    }

    public static class Substract{
        public int intA, intB;
    }

    public static class SubstractResponse{
        public int SubstractResult;
    }

    public static class Multiply{
        public int intA, intB;
    }

    public static class MultiplyResponse{
    	public int MultiplyResult;
    }

    public static class Divide{
        public int intA, intB;
    }

    public static class DivideResponse{
    	public int DivideResult;
    }

    //Method implementations
    @WebMethod(operationName="Add")
    public AddResponse Add(@WebParam(name="parameters") Add parameters){
        AddResponse result = new AddResponse();
        result.AddResult = parameters.intA + parameters.intB;
    	return result;
    }

    @WebMethod(operationName="Substract")
    public SubstractResponse Substract(@WebParam(name="parameters") Substract parameters){
        SubstractResponse result = new SubstractResponse();
        result.SubstractResult = parameters.intA - parameters.intB;
    	return result;
    }

    @WebMethod(operationName="Multiply")
    public MultiplyResponse Multiply(@WebParam(name="parameters") Multiply parameters){
    	MultiplyResponse result = new MultiplyResponse();
        result.MultiplyResult = parameters.intA * parameters.intB;
    	return result;
    }

    @WebMethod(operationName="Divide")
    public DivideResponse Divide(@WebParam(name="parameters") Divide parameters){
    	DivideResponse result = new DivideResponse();
        result.DivideResult = parameters.intA / parameters.intB;
    	return result;
    }

}
