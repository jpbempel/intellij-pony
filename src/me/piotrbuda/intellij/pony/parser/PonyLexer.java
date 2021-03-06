/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package me.piotrbuda.intellij.pony.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.*;
import com.intellij.psi.TokenType;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>pony.flex</tt>
 */
public class PonyLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYDOC = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 13872 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\1\50\1\51\1\52\1\53\3\21\1\25\1\54\1\55\5\21\2\25\1\56\31\21\1\25"+
    "\1\57\1\21\1\60\40\21\1\61\17\21\1\62\1\63\1\64\1\65\13\21\1\66\10\21\123"+
    "\25\1\67\7\25\1\70\1\71\37\21\1\25\1\71\u0582\21\1\72\u017f\21");

  /* The ZZ_CMAP_Y table has 3776 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\2\0\1\10\1\11\1\12\1\13\1\14\1\15\3\0"+
    "\1\16\1\17\1\20\1\21\2\0\1\22\3\0\1\22\71\0\1\23\1\0\1\24\1\25\1\26\1\27\2"+
    "\25\16\0\1\30\1\16\1\31\1\32\2\0\1\33\11\0\1\34\21\0\1\33\1\35\23\0\1\25\1"+
    "\36\3\0\1\22\1\37\1\36\4\0\1\40\1\36\4\0\1\34\1\41\1\25\3\0\2\42\1\25\1\26"+
    "\1\43\1\0\1\42\10\0\1\5\1\44\14\0\1\45\1\34\1\0\1\46\1\5\1\47\1\25\1\40\7"+
    "\0\1\50\14\0\1\24\1\25\1\5\1\51\4\0\1\52\1\21\5\0\1\52\2\25\3\0\1\2\10\25"+
    "\1\46\1\26\6\25\1\53\2\0\1\22\14\0\1\54\1\5\2\36\1\55\1\56\1\57\2\0\1\46\1"+
    "\60\1\61\1\56\1\62\1\40\1\63\1\54\1\5\1\2\1\43\1\55\1\64\1\57\2\0\1\46\1\65"+
    "\1\66\1\64\1\67\1\37\1\70\1\71\1\5\1\52\1\25\1\55\1\34\1\33\2\0\1\46\1\72"+
    "\1\61\1\34\1\73\1\74\1\25\1\54\1\5\1\37\1\25\1\55\1\56\1\57\2\0\1\46\1\72"+
    "\1\61\1\56\1\67\1\75\1\63\1\54\1\5\1\37\1\25\1\76\1\77\1\100\1\101\1\102\1"+
    "\77\1\0\1\23\1\77\1\100\1\103\1\25\1\71\1\5\1\25\1\37\1\55\1\30\1\46\2\0\1"+
    "\46\1\45\1\104\1\30\1\100\1\105\1\24\1\54\1\5\2\25\1\76\1\30\1\46\2\0\1\46"+
    "\1\45\1\61\1\30\1\100\1\105\1\31\1\54\1\5\1\106\1\25\1\76\1\30\1\46\4\0\1"+
    "\50\1\30\1\107\1\40\1\25\1\54\1\5\1\25\1\35\1\76\1\0\1\22\1\35\2\0\1\33\1"+
    "\110\1\22\1\111\1\112\1\0\1\113\1\114\1\115\1\25\1\36\6\0\1\64\1\0\1\22\1"+
    "\5\1\116\4\25\1\117\1\120\1\53\1\36\1\121\1\76\1\0\1\73\1\112\1\52\1\5\1\122"+
    "\4\25\1\74\2\25\1\24\1\5\1\116\1\123\1\124\1\0\1\36\3\0\1\26\1\36\1\0\1\30"+
    "\2\0\1\36\3\0\1\26\1\31\7\25\10\0\1\5\1\116\10\0\1\5\1\125\4\0\1\34\1\20\5"+
    "\0\1\126\51\0\1\100\1\22\1\100\5\0\1\100\4\0\1\100\1\22\1\100\1\0\1\22\7\0"+
    "\1\100\10\0\1\50\4\25\2\0\2\25\12\0\1\26\1\25\1\36\114\0\1\56\2\0\1\36\2\0"+
    "\1\42\11\0\1\77\1\74\1\25\1\0\1\30\1\26\1\25\2\0\1\26\1\25\2\0\1\2\1\25\1"+
    "\0\1\30\1\127\1\25\12\0\1\130\1\131\1\5\1\116\3\25\1\131\1\5\1\116\13\0\1"+
    "\25\5\0\1\42\10\0\1\52\1\25\3\0\1\26\1\0\1\2\1\0\1\2\1\71\1\5\3\0\1\52\1\26"+
    "\1\25\5\0\1\2\3\0\1\24\1\5\1\116\4\25\3\0\1\2\7\0\1\22\3\0\1\56\1\5\1\116"+
    "\1\5\1\116\1\40\13\25\11\0\1\2\1\5\1\116\1\25\1\132\1\2\1\25\6\0\1\5\1\51"+
    "\6\0\1\2\1\25\7\0\1\25\1\5\1\133\1\5\1\51\3\0\1\52\12\25\1\126\3\0\1\22\1"+
    "\25\34\0\1\22\2\25\1\53\42\0\2\52\4\0\2\52\1\0\1\134\3\0\1\52\6\0\1\30\1\112"+
    "\1\135\1\26\1\136\1\2\1\0\1\26\1\135\1\26\1\25\1\132\3\25\1\137\1\25\1\40"+
    "\1\74\1\25\1\140\1\25\1\26\1\35\1\37\1\40\2\25\1\0\1\26\3\0\1\42\2\25\1\0"+
    "\1\26\1\141\1\0\1\74\1\25\1\111\1\35\1\110\1\142\1\27\1\143\1\0\1\61\1\144"+
    "\1\145\2\25\5\0\1\74\116\25\5\0\1\22\5\0\1\22\20\0\1\26\1\132\1\2\1\25\4\0"+
    "\1\34\1\20\7\0\1\40\1\25\1\40\2\0\1\22\1\25\10\22\4\0\5\25\1\40\72\25\1\144"+
    "\3\25\1\36\1\0\1\142\1\26\1\36\11\0\1\22\1\146\1\36\12\0\1\126\1\144\4\0\1"+
    "\52\1\36\12\0\1\22\2\25\3\0\1\42\6\25\170\0\1\52\11\25\71\0\1\26\6\25\21\0"+
    "\1\26\10\25\5\0\1\52\41\0\1\26\2\0\1\5\1\147\2\25\6\0\1\53\1\34\3\0\1\40\12"+
    "\0\1\24\3\25\1\40\1\0\1\35\14\0\1\62\1\2\1\25\1\0\1\42\11\25\6\0\2\25\1\74"+
    "\6\0\1\2\1\25\10\0\1\26\1\25\1\5\1\116\3\0\1\43\1\5\1\51\3\0\1\52\4\0\1\2"+
    "\1\25\3\0\1\26\10\0\1\74\1\40\1\5\1\116\2\25\1\114\1\150\6\0\1\22\1\25\1\0"+
    "\1\52\1\5\1\116\2\0\1\22\1\115\10\0\1\42\2\25\1\131\2\0\1\151\1\25\3\152\1"+
    "\25\2\22\22\25\5\0\1\153\1\5\1\116\64\0\1\2\1\25\2\0\1\22\1\132\5\0\1\2\40"+
    "\25\55\0\1\52\15\0\1\24\4\25\1\22\1\25\1\132\1\144\1\0\1\46\1\22\1\112\1\154"+
    "\15\0\1\24\3\25\1\132\54\0\1\52\2\25\10\0\1\35\6\0\5\25\1\0\1\26\2\0\2\25"+
    "\1\22\1\25\1\102\2\25\1\144\3\25\1\37\1\30\20\0\1\56\1\140\1\25\1\5\1\116"+
    "\1\36\2\0\1\64\1\36\2\0\1\42\1\75\12\0\1\22\3\35\1\155\1\156\2\25\1\157\1"+
    "\0\1\45\2\0\1\22\2\0\1\160\1\0\1\52\1\0\1\52\4\25\17\0\1\42\10\25\6\0\1\26"+
    "\20\25\1\20\20\25\3\0\1\26\6\0\1\74\5\25\3\0\1\22\2\25\3\0\1\42\6\25\3\0\1"+
    "\52\4\0\1\2\1\0\1\142\5\25\23\0\1\52\1\5\1\116\52\25\1\52\1\46\4\0\1\34\1"+
    "\161\2\0\1\52\25\25\2\0\1\52\1\25\3\0\1\24\10\25\7\0\1\75\10\25\1\162\1\53"+
    "\1\45\1\36\2\0\1\2\1\64\4\25\3\0\1\26\20\25\6\0\1\52\1\25\2\0\1\52\1\25\2"+
    "\0\1\42\21\25\11\0\1\74\66\25\10\0\1\22\3\25\1\71\1\5\2\25\7\0\1\163\2\25"+
    "\3\0\1\74\1\5\1\116\6\0\1\164\1\5\10\25\10\0\1\26\1\25\1\5\1\116\42\25\1\114"+
    "\1\150\72\25\1\114\1\150\56\25\1\114\1\150\4\25\7\0\1\25\1\5\1\116\14\25\1"+
    "\114\1\150\64\25\1\114\1\150\42\25\55\0\1\22\22\25\14\0\1\42\63\25\5\0\1\22"+
    "\72\25\7\0\1\74\4\25\1\114\1\150\34\25\1\114\1\150\64\25\10\0\1\26\1\25\5"+
    "\0\1\22\1\25\1\40\2\0\14\25\1\24\153\25\1\144\1\104\2\0\1\50\1\2\3\25\1\16"+
    "\22\25\1\155\67\25\12\0\1\30\10\0\1\30\1\165\1\166\1\0\1\167\1\45\7\0\1\34"+
    "\1\50\2\30\3\0\1\170\1\112\1\35\1\46\51\0\1\52\3\0\1\46\2\0\1\126\3\0\1\126"+
    "\2\0\1\30\3\0\1\30\2\0\1\22\3\0\1\22\3\0\1\46\3\0\1\46\2\0\1\126\1\54\6\5"+
    "\1\45\3\0\1\117\1\36\1\126\1\171\1\111\1\172\1\117\1\134\1\117\2\126\1\70"+
    "\1\0\1\33\1\0\1\2\1\55\1\33\1\0\1\2\50\25\32\0\1\22\5\25\106\0\1\26\1\25\33"+
    "\0\1\52\74\25\1\37\3\25\14\0\20\25\36\0\2\25");

  /* The ZZ_CMAP_A table has 984 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\7\1\3\1\1\1\43\1\44\1\2\6\7\4\0\1\3\1\37\1\42\1\0\1\7\1\32\1\54\1\7\1"+
    "\56\1\61\2\32\1\65\1\32\1\5\1\33\12\10\1\60\1\64\1\34\1\36\1\35\1\50\1\47"+
    "\12\7\1\57\1\0\1\62\1\0\1\6\1\0\1\21\1\40\1\22\1\30\1\14\1\20\1\41\1\53\1"+
    "\15\1\55\1\52\1\25\1\23\1\16\1\27\1\13\1\7\1\17\1\26\1\11\1\46\1\24\1\51\1"+
    "\31\1\12\1\7\1\0\1\63\2\0\6\7\1\45\2\7\2\0\4\7\4\0\1\7\2\0\1\7\7\0\1\7\4\0"+
    "\1\7\5\0\7\7\1\0\2\7\4\0\4\7\16\0\5\7\7\0\1\7\1\0\1\7\1\0\5\7\1\0\2\7\6\0"+
    "\1\7\1\0\3\7\1\0\1\7\1\0\4\7\1\0\13\7\1\0\1\7\2\0\6\7\1\0\7\7\1\0\1\7\15\0"+
    "\1\7\1\0\2\7\1\0\2\7\1\0\4\7\10\0\1\7\4\0\2\10\4\0\6\7\1\0\4\7\1\0\6\7\2\10"+
    "\3\7\2\0\4\7\2\0\3\7\2\10\14\7\6\0\10\7\2\0\2\10\1\0\3\7\1\0\10\7\2\0\2\7"+
    "\2\0\6\7\1\0\1\7\3\0\4\7\2\0\5\7\2\0\4\7\5\0\2\7\1\0\4\7\4\0\2\7\1\0\2\7\1"+
    "\0\2\7\1\0\2\7\2\0\1\7\1\0\3\7\2\0\3\7\3\0\4\7\1\0\1\7\7\0\2\10\1\7\1\0\2"+
    "\7\1\0\5\7\1\0\3\7\2\0\1\7\15\0\2\7\2\0\2\7\1\0\6\7\3\0\3\7\1\0\4\7\3\0\2"+
    "\7\1\0\1\7\1\0\2\7\3\0\2\7\3\0\1\7\6\0\3\7\3\0\3\7\5\0\2\7\2\0\2\7\5\0\1\7"+
    "\1\0\5\7\1\0\4\7\1\0\1\7\4\0\1\7\4\0\6\7\1\0\1\7\7\0\12\4\2\0\2\7\4\0\2\10"+
    "\7\0\2\7\1\0\1\7\2\0\2\7\1\0\1\7\2\0\1\7\3\0\3\7\1\0\1\7\1\0\1\7\2\10\2\0"+
    "\4\7\5\0\1\7\1\0\1\7\1\0\1\7\4\0\2\7\2\10\4\7\2\0\3\7\1\0\5\7\1\0\2\7\4\0"+
    "\4\7\3\0\1\7\3\0\3\7\5\0\5\7\2\10\3\0\3\7\1\0\1\7\1\0\1\7\1\0\1\7\1\0\1\7"+
    "\2\0\3\7\1\0\6\7\2\0\2\7\2\43\5\7\5\0\1\7\4\0\1\7\3\0\3\7\1\0\5\7\2\0\1\7"+
    "\1\0\4\7\1\0\1\7\5\0\5\7\4\0\1\7\2\0\2\7\2\0\3\7\2\10\2\7\4\0\2\4\10\0\5\7"+
    "\2\0\6\7\1\0\3\7\1\0\2\7\2\0\2\7\1\0\2\7\1\0\2\7\2\0\3\7\3\0\2\7\3\0\2\7\2"+
    "\0\3\7\4\0\3\7\1\0\2\7\1\0\2\7\3\0\1\7\2\0\5\7\1\0\2\7\1\0\3\7\2\0\1\7\2\0"+
    "\5\7\1\0\2\10\2\0\1\7\2\0\2\7\2\0\4\7\1\0\4\7\1\0\1\7\1\0\5\7\1\0\4\7\2\0"+
    "\1\7\1\0\1\7\5\0\1\7\1\0\1\7\1\0\3\7");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\1\5\1\6\1\1\1\5"+
    "\17\1\4\7\1\10\1\3\1\1\1\3\1\11\1\1"+
    "\1\12\1\13\1\1\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\2\1\4\1\2\1\0"+
    "\1\25\11\1\1\26\1\27\1\30\10\1\1\31\6\1"+
    "\1\30\1\1\1\32\1\1\1\0\1\33\1\34\2\1"+
    "\1\0\1\35\4\1\1\2\1\1\1\36\1\37\3\1"+
    "\1\40\5\1\1\41\3\1\1\42\5\1\1\43\1\44"+
    "\2\1\2\45\1\1\1\35\1\46\1\1\1\47\3\1"+
    "\1\50\1\51\1\1\1\52\2\1\1\53\17\1\1\54"+
    "\3\1\1\55\11\1\1\56\2\1\1\57\1\60\1\61"+
    "\1\62\1\1\1\63\2\1\1\64\1\65\4\1\1\66"+
    "\1\67\3\1\1\70\1\1\1\71\2\1\1\72\3\1"+
    "\1\73\10\1\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da"+
    "\0\154\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654"+
    "\0\154\0\u068a\0\154\0\154\0\u06c0\0\154\0\154\0\154"+
    "\0\154\0\154\0\154\0\154\0\154\0\154\0\u06f6\0\u072c"+
    "\0\u0762\0\u010e\0\u0144\0\u01b0\0\u0798\0\u07ce\0\u0804\0\u083a"+
    "\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u017a\0\u097e\0\u09b4"+
    "\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e\0\u017a"+
    "\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u017a\0\u0ca8"+
    "\0\u017a\0\u0cde\0\u0d14\0\154\0\u017a\0\u0d4a\0\u0d80\0\u0db6"+
    "\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u017a"+
    "\0\u017a\0\u0f66\0\u0f9c\0\u0fd2\0\u017a\0\u1008\0\u103e\0\u1074"+
    "\0\u10aa\0\u10e0\0\u017a\0\u1116\0\u114c\0\u1182\0\u017a\0\u11b8"+
    "\0\u11ee\0\u1224\0\u125a\0\u1290\0\u017a\0\u017a\0\u12c6\0\u12fc"+
    "\0\154\0\u1332\0\u1368\0\u0db6\0\u0db6\0\u139e\0\u017a\0\u13d4"+
    "\0\u140a\0\u1440\0\u06f6\0\u017a\0\u1476\0\u017a\0\u14ac\0\u14e2"+
    "\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0\0\u1626\0\u165c\0\u1692"+
    "\0\u16c8\0\u16fe\0\u1734\0\u176a\0\u17a0\0\u17d6\0\u180c\0\u1842"+
    "\0\u017a\0\u1878\0\u18ae\0\u18e4\0\u017a\0\u191a\0\u1950\0\u1986"+
    "\0\u19bc\0\u19f2\0\u1a28\0\u1a5e\0\u1a94\0\u1aca\0\u017a\0\u1b00"+
    "\0\u1b36\0\u017a\0\u017a\0\u017a\0\u017a\0\u1b6c\0\u017a\0\u1ba2"+
    "\0\u1bd8\0\u017a\0\u017a\0\u1c0e\0\u1c44\0\u1c7a\0\u1cb0\0\u017a"+
    "\0\u017a\0\u1ce6\0\u1d1c\0\u1d52\0\u017a\0\u1d88\0\u017a\0\u1dbe"+
    "\0\u1df4\0\u017a\0\u1e2a\0\u1e60\0\u1e96\0\u017a\0\u1ecc\0\u1f02"+
    "\0\u1f38\0\u1f6e\0\u1fa4\0\u1fda\0\u2010\0\u2046\0\u017a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\7\2\10\1\11\1\12"+
    "\1\10\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\10\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\10"+
    "\1\40\1\41\1\5\1\10\1\42\1\43\1\44\1\45"+
    "\2\10\1\46\1\10\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\2\4\1\60\36\57\1\61"+
    "\1\41\1\5\1\41\20\57\67\0\2\4\66\0\1\5"+
    "\40\0\1\5\25\0\1\62\1\63\2\0\1\62\61\0"+
    "\1\63\3\0\1\63\63\0\24\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\14\0\1\62\1\63"+
    "\2\10\1\64\21\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\4\10\1\65\4\10\1\66"+
    "\1\10\1\67\10\10\6\0\2\10\3\0\2\10\2\0"+
    "\2\10\1\70\1\0\1\10\16\0\11\10\1\71\12\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\10\10\1\72\1\73\5\10\1\74\4\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\10\10\1\75\1\10\1\76\5\10\1\77\1\10\1\100"+
    "\1\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\6\10\1\101\12\10\1\102\2\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\6\10\1\103\15\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\21\10\1\104\2\10\6\0"+
    "\2\10\3\0\1\10\1\105\2\0\3\10\1\0\1\10"+
    "\16\0\10\10\1\106\3\10\1\107\3\10\1\110\3\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\17\10\1\111\1\10\1\112\2\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\13\10"+
    "\1\113\10\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\13\10\1\114\10\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\6\10"+
    "\1\115\4\10\1\116\10\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\11\10\1\117\12\10"+
    "\6\0\1\120\1\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\21\10\1\121\2\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\21\10\1\122"+
    "\2\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\43\0\1\123\66\0\1\31\1\0\1\31\64\0"+
    "\2\31\64\0\1\124\1\31\65\0\1\31\35\0\6\10"+
    "\1\125\2\10\1\126\7\10\1\127\2\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\10\0\1\130"+
    "\2\0\37\130\1\131\3\0\20\130\6\0\10\10\1\132"+
    "\7\10\1\133\3\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\7\10\1\134\14\10\6\0"+
    "\2\10\3\0\2\10\2\0\2\10\1\135\1\0\1\10"+
    "\10\0\1\57\2\0\40\57\3\0\21\57\2\0\1\60"+
    "\37\57\1\0\1\5\1\0\21\57\2\0\37\57\1\136"+
    "\3\0\20\57\6\0\5\10\1\137\16\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\4\10"+
    "\1\140\3\10\1\141\2\10\1\142\10\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\24\10"+
    "\6\0\1\10\1\141\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\6\10\1\143\15\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\7\10\1\144"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\22\10\1\145\1\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\11\10\1\146"+
    "\12\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\20\10\1\147\3\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\3\10\1\150"+
    "\20\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\10\10\1\151\10\10\1\141\2\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\6\10\1\152\15\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\24\10\6\0\2\10\3\0"+
    "\2\10\2\0\1\125\2\10\1\0\1\10\16\0\3\10"+
    "\1\153\20\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\3\10\1\154\1\10\1\155\4\10"+
    "\1\141\1\10\1\156\7\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\11\10\1\157\12\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\10\10\1\125\13\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\22\10\1\117\1\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\3\10\1\160\20\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\13\10\1\161\10\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\10\10\1\162\4\10\1\163\6\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\3\10"+
    "\1\164\20\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\11\10\1\165\5\10\1\141\4\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\3\10\1\166\20\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\15\10\1\167\6\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\24\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\170\16\0\11\10\1\117\12\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\10\0\1\123"+
    "\1\171\1\172\40\123\3\0\20\123\6\0\6\10\1\173"+
    "\15\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\23\10\1\141\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\10\0\1\130\2\0\37\130"+
    "\1\174\3\0\21\130\2\0\37\130\1\175\3\0\20\130"+
    "\6\0\3\10\1\176\20\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\6\10\1\177\15\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\3\10\1\200\20\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\6\10\1\201\1\202"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\10\0\1\57\2\0\37\57\1\203\3\0\20\57"+
    "\6\0\6\10\1\204\15\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\7\10\1\205\14\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\10\10\1\206\13\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\15\10\1\207\6\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\21\10\1\210\2\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\6\10\1\211\15\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\6\10\1\212\15\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\3\10\1\117\20\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\10\10\1\213\13\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\16\0\24\10\6\0\2\10"+
    "\3\0\1\10\1\214\2\0\3\10\1\0\1\10\16\0"+
    "\6\10\1\215\15\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\21\10\1\216\2\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\21\10\1\217\2\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\20\10\1\220\3\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\3\10\1\221\14\10\1\222\3\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\5\10\1\223"+
    "\16\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\14\10\1\224\7\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\24\10\6\0"+
    "\1\225\1\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\6\10\1\226\15\10\6\0\2\10\3\0\2\10"+
    "\2\0\3\10\1\0\1\10\11\0\1\171\72\0\13\10"+
    "\1\227\10\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\7\10\1\230\14\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\24\10"+
    "\6\0\2\10\3\0\2\10\2\0\2\10\1\231\1\0"+
    "\1\10\16\0\11\10\1\232\12\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\17\10\1\233"+
    "\4\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\3\10\1\204\20\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\7\10\1\234"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\11\10\1\235\12\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\7\10\1\236"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\11\10\1\237\12\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\3\10\1\240"+
    "\20\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\11\10\1\241\12\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\13\10\1\242"+
    "\10\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\16\10\1\243\5\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\11\10\1\204"+
    "\12\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\20\10\1\204\3\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\7\10\1\244"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\24\10\6\0\2\10\3\0\1\10\1\245"+
    "\2\0\3\10\1\0\1\10\16\0\7\10\1\246\14\10"+
    "\6\0\2\10\3\0\2\10\2\0\3\10\1\0\1\10"+
    "\16\0\24\10\6\0\2\10\3\0\2\10\2\0\2\10"+
    "\1\247\1\0\1\10\16\0\22\10\1\250\1\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\14\10\1\251\7\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\24\10\6\0\2\10\3\0"+
    "\2\10\2\0\1\10\1\252\1\10\1\0\1\10\16\0"+
    "\17\10\1\253\4\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\6\10\1\254\15\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\6\10\1\255\15\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\3\10\1\256\20\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\12\10\1\257\11\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\12\10\1\260\11\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\7\10\1\261\14\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\10\10\1\262\13\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\3\10\1\263\20\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\6\10\1\264\15\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\10\10\1\265\13\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\15\10\1\266\6\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\17\10\1\267\4\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\13\10\1\270\10\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\3\10\1\271\20\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\7\10\1\272\14\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\13\10\1\273\10\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\3\10\1\274\20\10\6\0"+
    "\2\10\3\0\2\10\2\0\3\10\1\0\1\10\16\0"+
    "\11\10\1\275\12\10\6\0\2\10\3\0\2\10\2\0"+
    "\3\10\1\0\1\10\16\0\24\10\6\0\2\10\3\0"+
    "\1\10\1\276\2\0\3\10\1\0\1\10\16\0\6\10"+
    "\1\277\15\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\6\10\1\300\15\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\16\10"+
    "\1\137\5\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\14\10\1\137\7\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\4\10"+
    "\1\301\17\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\6\10\1\302\15\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\11\10"+
    "\1\303\12\10\6\0\2\10\3\0\2\10\2\0\3\10"+
    "\1\0\1\10\16\0\21\10\1\304\2\10\6\0\2\10"+
    "\3\0\2\10\2\0\3\10\1\0\1\10\16\0\1\305"+
    "\23\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\12\10\1\306\11\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\7\10\1\307"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\10\10\1\310\13\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\3\10\1\311"+
    "\20\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\11\10\1\312\12\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\7\10\1\313"+
    "\14\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\10\10\1\314\13\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\20\10\1\315"+
    "\3\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\16\0\7\10\1\316\14\10\6\0\2\10\3\0"+
    "\2\10\2\0\3\10\1\0\1\10\16\0\14\10\1\317"+
    "\7\10\6\0\2\10\3\0\2\10\2\0\3\10\1\0"+
    "\1\10\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8316];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\1\11\25\1\1\11\7\1\1\11\1\1\2\11"+
    "\1\1\11\11\3\1\1\0\40\1\1\0\1\11\3\1"+
    "\1\0\40\1\1\11\126\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public PonyLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PonyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ID;
            }
          case 61: break;
          case 2: 
            { return ML_COMMENT_CONTENT;
            }
          case 62: break;
          case 3: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 63: break;
          case 4: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 64: break;
          case 5: 
            { return INT;
            }
          case 65: break;
          case 6: 
            { return DOT;
            }
          case 66: break;
          case 7: 
            { return PONY_OPERATOR;
            }
          case 67: break;
          case 8: 
            { return PONY_EQUALS;
            }
          case 68: break;
          case 9: 
            { throw new Error("Illegal character <"+yytext()+">");
            }
          case 69: break;
          case 10: 
            { return PONY_AT;
            }
          case 70: break;
          case 11: 
            { return PONY_QUESTION;
            }
          case 71: break;
          case 12: 
            { return PONY_AMPERSAND;
            }
          case 72: break;
          case 13: 
            { return LPAREN_NEW;
            }
          case 73: break;
          case 14: 
            { return LSQUARE_NEW;
            }
          case 74: break;
          case 15: 
            { return BEGIN_TYPE;
            }
          case 75: break;
          case 16: 
            { return RPAREN;
            }
          case 76: break;
          case 17: 
            { return RSQUARE;
            }
          case 77: break;
          case 18: 
            { return PONY_UNION;
            }
          case 78: break;
          case 19: 
            { return PONY_SEMICOLON;
            }
          case 79: break;
          case 20: 
            { return PONY_COLON;
            }
          case 80: break;
          case 21: 
            { return FLOAT;
            }
          case 81: break;
          case 22: 
            { return PONY_IN;
            }
          case 82: break;
          case 23: 
            { return PONY_IF;
            }
          case 83: break;
          case 24: 
            { return BINOP;
            }
          case 84: break;
          case 25: 
            { return PONY_AS;
            }
          case 85: break;
          case 26: 
            { return PONY_DO;
            }
          case 86: break;
          case 27: 
            { return BEGIN_RAWSEQ;
            }
          case 87: break;
          case 28: 
            { return PONY_METHOD;
            }
          case 88: break;
          case 29: 
            { return STRING;
            }
          case 89: break;
          case 30: 
            { return PONY_TRY;
            }
          case 90: break;
          case 31: 
            { return CAP;
            }
          case 91: break;
          case 32: 
            { return PONY_END;
            }
          case 92: break;
          case 33: 
            { return PONY_NOT;
            }
          case 93: break;
          case 34: 
            { return PONY_FOR;
            }
          case 94: break;
          case 35: 
            { return PONY_VAR;
            }
          case 95: break;
          case 36: 
            { return PONY_LET;
            }
          case 96: break;
          case 37: 
            { return LINE_COMMENT;
            }
          case 97: break;
          case 38: 
            { yybegin(YYDOC); return ML_COMMENT;
            }
          case 98: break;
          case 39: 
            { return PONY_USE;
            }
          case 99: break;
          case 40: 
            { yybegin(YYINITIAL); return ML_COMMENT;
            }
          case 100: break;
          case 41: 
            { return PONY_CLASS_DEF;
            }
          case 101: break;
          case 42: 
            { return PONY_THEN;
            }
          case 102: break;
          case 43: 
            { return PONY_ELSE;
            }
          case 103: break;
          case 44: 
            { return PONY_WITH;
            }
          case 104: break;
          case 45: 
            { return PONY_ERROR;
            }
          case 105: break;
          case 46: 
            { return PONY_MATCH;
            }
          case 106: break;
          case 47: 
            { return PONY_BREAK;
            }
          case 107: break;
          case 48: 
            { return PONY_UNTIL;
            }
          case 108: break;
          case 49: 
            { return PONY_WHERE;
            }
          case 109: break;
          case 50: 
            { return PONY_WHILE;
            }
          case 110: break;
          case 51: 
            { return PONY_ELSEIF;
            }
          case 111: break;
          case 52: 
            { return PONY_RETURN;
            }
          case 112: break;
          case 53: 
            { return PONY_REPEAT;
            }
          case 113: break;
          case 54: 
            { return PONY_LAMBDA;
            }
          case 114: break;
          case 55: 
            { return PONY_OBJECT;
            }
          case 115: break;
          case 56: 
            { return PONY_RECOVER;
            }
          case 116: break;
          case 57: 
            { return PONY_CONSUME;
            }
          case 117: break;
          case 58: 
            { return PONY_CONTINUE;
            }
          case 118: break;
          case 59: 
            { return PONY_IDENTITYOF;
            }
          case 119: break;
          case 60: 
            { return PONY_COMPILER;
            }
          case 120: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
