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
 * The base class for all named abstractions.
 */
public abstract class NamedAbstraction extends Abstraction implements Cloneable {

  /** A unique identifier for the abstraction; */
  protected long entityId;

  /** The name of the abstraction; */
  protected String name;

  /**
   * Standard constructor - builds a NamedAbstraction with the specified name and id.
   * @param name The name of the abstraction;
   * @param entityId The id used by the model to identify the abstraction;
   */
  protected NamedAbstraction(String name, long entityId) {
    this.name = name;
    this.entityId = entityId;
  }

  /**
   * Standard constructor - builds a NamedAbstraction with an entity ID of zero.
   * @param name The name of the abstraction;
   */
  public NamedAbstraction(String name) {
    this(name, 0L);
  }

  /**
   * Returns the name of the abstraction.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name of the abstraction.
   * @param name The new name for the abstraction;
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns the entity id.
   */
  public long getEntityId() {
    return entityId;
  }

  /**
   * Sets the entity id for this abstraction.
   * @param id The new entity id;
   */
  public void setEntityId(long id) {
    this.entityId = id;
  }

  /**
   * Creates a clone of this abstraction.
   */
  public Object clone() throws CloneNotSupportedException {
    NamedAbstraction duplicate = null;
    duplicate = (NamedAbstraction)super.clone();
    return duplicate;
  }

}