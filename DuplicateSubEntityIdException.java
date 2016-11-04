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

/**
 * An exception that indicates that a sub-entity has been added to an Abstraction using an id that
 * is already in use.
 */
public class DuplicateSubEntityIdException extends AbstractionException {

  /**
   * Standard constructor - builds an exception with the specified message.
   * @param message A string describing the exception;
   */
  public DuplicateSubEntityIdException(String message) {
    super(message);
  }

}