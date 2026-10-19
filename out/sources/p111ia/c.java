package p111ia;

import I.f;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p011ab.e;
import p011ab.m;
import p024bb.d;
import p050db.g;
import p050db.q;
import p318zb.C2839f;

/* JADX INFO: compiled from: Tag.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final f a(long j, long j10) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new f(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    public static final void b(d dVar) {
        i.e(dVar, "<this>");
        if ((dVar instanceof q ? (q) dVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + l.a(dVar.getClass()));
    }

    public static final g c(p024bb.c cVar) {
        i.e(cVar, "<this>");
        g gVar = cVar instanceof g ? (g) cVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + l.a(cVar.getClass()));
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 ??, still in use, count: 1, list:
          (r1v5 ?? I:java.lang.Object) from 0x0118: INVOKE (r35v0 ?? I:androidx.compose.runtime.f), (r1v5 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.f.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:281)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static androidx.compose.material.C1037m e(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 ??, still in use, count: 1, list:
          (r1v5 ?? I:java.lang.Object) from 0x0118: INVOKE (r35v0 ?? I:androidx.compose.runtime.f), (r1v5 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.f.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:281)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public static final int f(e eVar, e[] typeParams) {
        i.e(eVar, "<this>");
        i.e(typeParams, "typeParams");
        int iHashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iF = eVar.f();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i11 = iF - 1;
            int i12 = i10 * 31;
            String strA = eVar.i(eVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i10 = i12 + iHashCode2;
            iF = i11;
        }
        int iF2 = eVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iF2 - 1;
            int i14 = iHashCode3 * 31;
            m mVarE = eVar.i(eVar.f() - iF2).e();
            iHashCode3 = i14 + (mVarE != null ? mVarE.hashCode() : 0);
            iF2 = i13;
        }
    }

    public static final boolean g(C2839f c2839f) {
        i.e(c2839f, "<this>");
        try {
            C2839f c2839f2 = new C2839f();
            c2839f.i(c2839f2, 0L, Na.l.A(c2839f.f49074c, 64L));
            for (int i10 = 0; i10 < 16 && !c2839f2.j(); i10++) {
                int iS0 = c2839f2.s0();
                if (Character.isISOControl(iS0) && !Character.isWhitespace(iS0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
