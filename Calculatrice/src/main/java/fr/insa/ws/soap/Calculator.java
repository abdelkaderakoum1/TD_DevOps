package fr.insa.ws.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName="Calculator")
public class Calculator{

    public static class Add{
        int intA, intB;
       
    }

    public static class AddResponse{
        int AddResult;
    }

    public static class Substract{
        int intA, intB;
    }

    public static class SubstractResponse{
        int SubstractResult;    
    }

    public static class Multiply{
        int intA, intB;
    }

    public static class MultiplyResponse{
    	int MultiplyResult;    
    }
    
    public static class Divide{
        int intA, intB;
    }

    public static class DivideResponse{
    	int DivideResult;    
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
