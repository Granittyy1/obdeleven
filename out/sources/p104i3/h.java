package p104i3;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import androidx.collection.C0891t;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;
import p116j3.e;
import p116j3.k;
import p164n3.c;

/* JADX INFO: compiled from: GradientStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f36661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0891t<LinearGradient> f36662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0891t<RadialGradient> f36663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RectF f36664t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final GradientType f36665u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f36666v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f36667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f36668x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f36669y;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(LottieDrawable lottieDrawable, a aVar, com.airbnb.lottie.model.content.a aVar2) {
        int iOrdinal = aVar2.f23439h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = aVar2.f23440i.ordinal();
        super(lottieDrawable, aVar, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, aVar2.j, aVar2.f23435d, aVar2.f23438g, aVar2.f23441k, aVar2.f23442l);
        this.f36662r = new C0891t<>();
        this.f36663s = new C0891t<>();
        this.f36664t = new RectF();
        this.f36665u = aVar2.f23433b;
        this.f36661q = aVar2.f23443m;
        this.f36666v = (int) (lottieDrawable.f23312b.b() / 32.0f);
        p116j3.a<c, c> aVarA = aVar2.f23434c.a();
        this.f36667w = (e) aVarA;
        aVarA.a(this);
        aVar.d(aVarA);
        p116j3.a<PointF, PointF> aVarA2 = aVar2.f23436e.a();
        this.f36668x = (k) aVarA2;
        aVarA2.a(this);
        aVar.d(aVarA2);
        p116j3.a<PointF, PointF> aVarA3 = aVar2.f23437f.a();
        this.f36669y = (k) aVarA3;
        aVarA3.a(this);
        aVar.d(aVarA3);
    }

    public final int d() {
        float f10 = this.f36668x.f41085d;
        float f11 = this.f36666v;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f36669y.f41085d * f11);
        int iRound3 = Math.round(this.f36667w.f41085d * f11);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v10 ??, still in use, count: 1, list:
          (r5v10 ?? I:java.lang.Object) from 0x0051: INVOKE (r7v1 ?? I:androidx.collection.t), (r5v10 ?? I:java.lang.Object), (r2v7 ?? I:long) VIRTUAL call: androidx.collection.t.e(java.lang.Object, long):void A[MD:(java.lang.Object, long):void (m)] (LINE:82)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p104i3.a, p104i3.d
    public final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v10 ??, still in use, count: 1, list:
          (r5v10 ?? I:java.lang.Object) from 0x0051: INVOKE (r7v1 ?? I:androidx.collection.t), (r5v10 ?? I:java.lang.Object), (r2v7 ?? I:long) VIRTUAL call: androidx.collection.t.e(java.lang.Object, long):void A[MD:(java.lang.Object, long):void (m)] (LINE:82)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
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
}
