/*
 * generated by Xtext
 */
package org.xtext.anomaly.report.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractReportValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.anomaly.report.report.ReportPackage.eINSTANCE);
		return result;
	}
}
