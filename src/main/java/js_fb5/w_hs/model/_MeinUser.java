// DO NOT EDIT.  Make changes to MeinUser.java instead.
package js_fb5.w_hs.model;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _MeinUser extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "MeinUser";

  // Attribute Keys
  public static final ERXKey<java.time.LocalDate> MY_TIME_IN_JAVA = new ERXKey<java.time.LocalDate>("myTimeInJava");
  public static final ERXKey<String> VOR_NAME = new ERXKey<String>("vorName");
  // Relationship Keys

  // Attributes
  public static final String MY_TIME_IN_JAVA_KEY = MY_TIME_IN_JAVA.key();
  public static final String VOR_NAME_KEY = VOR_NAME.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_MeinUser.class);

  public MeinUser localInstanceIn(EOEditingContext editingContext) {
    MeinUser localInstance = (MeinUser)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public java.time.LocalDate myTimeInJava() {
    return (java.time.LocalDate) storedValueForKey(_MeinUser.MY_TIME_IN_JAVA_KEY);
  }

  public void setMyTimeInJava(java.time.LocalDate value) {
    if (_MeinUser.LOG.isDebugEnabled()) {
    	_MeinUser.LOG.debug( "updating myTimeInJava from " + myTimeInJava() + " to " + value);
    }
    takeStoredValueForKey(value, _MeinUser.MY_TIME_IN_JAVA_KEY);
  }

  public String vorName() {
    return (String) storedValueForKey(_MeinUser.VOR_NAME_KEY);
  }

  public void setVorName(String value) {
    if (_MeinUser.LOG.isDebugEnabled()) {
    	_MeinUser.LOG.debug( "updating vorName from " + vorName() + " to " + value);
    }
    takeStoredValueForKey(value, _MeinUser.VOR_NAME_KEY);
  }


  public static MeinUser createMeinUser(EOEditingContext editingContext) {
    MeinUser eo = (MeinUser) EOUtilities.createAndInsertInstance(editingContext, _MeinUser.ENTITY_NAME);    
    return eo;
  }

  public static ERXFetchSpecification<MeinUser> fetchSpec() {
    return new ERXFetchSpecification<MeinUser>(_MeinUser.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<MeinUser> fetchAllMeinUsers(EOEditingContext editingContext) {
    return _MeinUser.fetchAllMeinUsers(editingContext, null);
  }

  public static NSArray<MeinUser> fetchAllMeinUsers(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MeinUser.fetchMeinUsers(editingContext, null, sortOrderings);
  }

  public static NSArray<MeinUser> fetchMeinUsers(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<MeinUser> fetchSpec = new ERXFetchSpecification<MeinUser>(_MeinUser.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MeinUser> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static MeinUser fetchMeinUser(EOEditingContext editingContext, String keyName, Object value) {
    return _MeinUser.fetchMeinUser(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MeinUser fetchMeinUser(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MeinUser> eoObjects = _MeinUser.fetchMeinUsers(editingContext, qualifier, null);
    MeinUser eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MeinUser that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MeinUser fetchRequiredMeinUser(EOEditingContext editingContext, String keyName, Object value) {
    return _MeinUser.fetchRequiredMeinUser(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MeinUser fetchRequiredMeinUser(EOEditingContext editingContext, EOQualifier qualifier) {
    MeinUser eoObject = _MeinUser.fetchMeinUser(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MeinUser that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MeinUser localInstanceIn(EOEditingContext editingContext, MeinUser eo) {
    MeinUser localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
