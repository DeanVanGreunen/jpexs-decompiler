/*
 *  Copyright (C) 2010-2011 JPEXS
 * 
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.jpexs.asdec.abc.types;

import com.jpexs.asdec.abc.ABC;
import com.jpexs.asdec.abc.avm2.ConstantPool;
import com.jpexs.asdec.abc.types.traits.Traits;


public class ClassInfo {

    public int cinit_index; //MethodInfo - static initializer
    public Traits static_traits;

    @Override
    public String toString() {
        return "method_index=" + cinit_index + "\r\n" + static_traits.toString();
    }


    public String toString(ABC abc) {
        return "method_index=" + cinit_index + "\r\n" + static_traits.toString(abc);
    }

    public String getStaticVarsStr(ConstantPool constants,ABC abc) {
        return static_traits.convert(constants, "\tstatic ",abc);
    }
}
