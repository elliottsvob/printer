package com.inform.printer;

import java.util.List;

@SuppressWarnings({"WeakerAccess","unused"})
public class Printer {

	private FormCollection formCollection;

	public Printer(){
		formCollection = new FormCollection();
	}

	public String print(){
		return printForms(getRequestedFormsToBePrinted());
	}

	private String printForms( List<String> forms) {
		StringBuilder responseBuilder = new StringBuilder();

		for(String form : forms){
			responseBuilder = extractFieldValues(formCollection.getFormData(form), responseBuilder);
		}

		return responseBuilder.toString();
	}

	private List<String> getRequestedFormsToBePrinted() {
		return formCollection.getFormNames();
	}

	private StringBuilder extractFieldValues(FormData data, StringBuilder responseBuilder) {

		for(String field : data.getFieldNames()){
			responseBuilder.append(" ").append(data.get(field));
		}

		return responseBuilder;
	}

	public FormCollection getFormCollection() {
		return formCollection;
	}

	public void setFormCollection(FormCollection formCollection) {
		this.formCollection = formCollection;
	}
}