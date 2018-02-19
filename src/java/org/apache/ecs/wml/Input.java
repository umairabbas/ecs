/*
 * ====================================================================
 * 
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2000-2003 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:  
 *       "This product includes software developed by the 
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Jakarta Element Construction Set", 
 *    "Jakarta ECS" , and "Apache Software Foundation" must not be used 
 *    to endorse or promote products derived
 *    from this software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    "Jakarta Element Construction Set" nor "Jakarta ECS" nor may "Apache" 
 *    appear in their names without prior written permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.ecs.wml;

import org.apache.ecs.Element;
import org.apache.ecs.SinglePartElement;

/**
    This class implements the input element
 
    @author Written by <a href="mailto:Anders.Samuelson@aspiro.com">Anders.Samuelson</a>
    @author Modifications by <a href="mailto:Orjan.Petersson@ehpt.com">�rjan Petersson</a>
*/
public class Input extends org.apache.ecs.SinglePartElement
{
    /**
	Basic constructor. Use the set* methods to set the values
	of the attributes.
    */
    public Input() {
	setBeginEndModifier('/');
	setElementType("input");
    }
    
    /**
	Constructor.
	@param name the name="" attribute
    */
    public Input(String name)
    {   
	this();
	setName(name);  
    }
    
    /**
	Constructor.
	@param name the name="" attribute
	@param defValue the type="" attribute
    */
    public Input(String name, Type type)
    {   
	this();
	setName(name);  
	setType(type);
    }
    
    /**
	Constructor.
	@param format the format="" attribute
	@param name the name="" attribute
	@param defValue the type="" attribute
    */
    public Input(String format, String name, Type type)
    {   
	this();
	setFormat(format);
	setName(name);  
	setType(type);
    }
    
    /**
	Sets the format="" attribute
	@param url the format="" attribute
    */
    public Input setFormat(String format)
    {
	addAttribute("format", format);
	return this;
    }
    
    /**
	Sets the name="" attribute
	@param name the name="" attribute
    */
    public Input setName(String name)
    {
	addAttribute("name", name);
	return this;
    }
    
    /**
	Sets the type="" attribute
	@param url the type="" attribute
    */
    public Input setType(Type type)
    {
	addAttribute("type", type.toString());
	return this;
    }
    
}
