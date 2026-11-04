package fr.insa.ws.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName="Calculator")
public class Calculator{

    private static class Add{
        private int intA, intB;
       
    }

    private static class AddResponse{
        private int AddResult;
    }

    private static class Substract{
        private int intA, intB;
    }

    private static class SubstractResponse{
        private int SubstractResult;    
    }

    private static class Multiply{
        private int intA, intB;
    }

    private static class MultiplyResponse{
    	private int MultiplyResult;    
    }
    
    private static class Divide{
        private int intA, intB;
    }

    private static class DivideResponse{
    	private int DivideResult;    
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
        result.SubstractResult = parameters.intA + parameters.intB;
    	return result;
    }
    
    @WebMethod(operationName="Multiply")
    public MultiplyResponse Multiply(@WebParam(name="parameters") Multiply parameters){
    	MultiplyResponse result = new MultiplyResponse();
        result.MultiplyResult = parameters.intA + parameters.intB;
    	return result;
    } 
    
    @WebMethod(operationName="Divide")    
    public DivideResponse Divide(@WebParam(name="parameters") Divide parameters){
    	DivideResponse result = new DivideResponse();
        result.DivideResult = parameters.intA + parameters.intB;
    	return result;
    } 

}
