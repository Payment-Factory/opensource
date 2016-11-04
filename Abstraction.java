/* ======================================================
 * JFinance : a class library for financial applications;
 * ======================================================
 * Version 0.2.0;
 * Written by David Gilbert;
 * (C) Copyright 2000, Simba Management Limited;
 *
 * Simba Management Limited is registered in England, number 3136023.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program;
 * if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307, USA.
 *
 * For information regarding updates to the JFinance library, please visit our website
 * (http://www.jrefinery.com) or e-mail David Gilbert (david.gilbert@bigfoot.com); */

package com.jrefinery.finance;

import java.util.*;

/**
 * The base class for representing all entities modelled in JFinance.
 * <P>
 * Abstractions are external to the model - that is, they are used to represent entities that have
 * been pulled from a JFinance model.  The representation inside the model is arbitrary, and not
 * related directly to the Abstraction.
 */
public abstract class Abstraction implements Cloneable {

  /**
   * Default constructor.
   */
  protected Abstraction() {
  }

  /**
   * Creates a clone of the Abstraction.  In general, clones should be independent copies, so that
   * modifications to the clone have no effect on the original.  However, you should read the
   * documentation for the clone() method in the subclass to understand the exact behaviour.
   */
  public Object clone() throws CloneNotSupportedException {
    Object duplicate = null;
    // make a 'shallow' copy...
    duplicate = super.clone();
    // make any required changes to the shallow copy...
    // then return the clone...
    return duplicate;
  }

  /**
   * An Abstraction is "complete" if all its attributes are specified (known).
   * <P>
   * An Abstraction can still be useful even when it is "incomplete".  For example, when handling
   * a list of BusinessDayCalendars, you might only need the names of the calendars, not all the
   * holiday rules for each calendar.
   */
  public abstract boolean isComplete();

}
