// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PonyNextatom extends PsiElement {

  @Nullable
  PonyLiteral getLiteral();

  @Nullable
  PonyMembers getMembers();

  @Nullable
  PonyNamed getNamed();

  @Nullable
  PonyParams getParams();

  @Nullable
  PonyPositional getPositional();

  @Nullable
  PonyRawseq getRawseq();

  @Nullable
  PonyTuple getTuple();

  @Nullable
  PonyType getType();

  @Nullable
  PonyTypeargs getTypeargs();

  @Nullable
  PonyTypeparams getTypeparams();

  @Nullable
  PonyTypes getTypes();

}
