package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface AllDifferentConstraintProtoOrBuilder extends MessageOrBuilder {
   List getVarsList();

   int getVarsCount();

   int getVars(int var1);
}