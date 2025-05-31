//program to demonstrate test suite
package junit.basictestcases;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import junit.basictestcases.testsuiteclasses.ClassATest;
import junit.basictestcases.testsuiteclasses.ClassBTest;



@Suite
@SelectClasses({ClassATest.class,ClassBTest.class})
//@SelectPackages("com.tns.basictestcases.testsuiteclasses")
@IncludeTags("production")
//@IncludeTags({"production","development"})
public class ProductionTest
{
}