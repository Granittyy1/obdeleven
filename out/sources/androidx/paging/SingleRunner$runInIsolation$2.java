package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {R.styleable.AppCompatTheme_colorControlActivated, R.styleable.AppCompatTheme_colorSwitchThumbNormal, R.styleable.AppCompatTheme_dialogCornerRadius, R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
final class SingleRunner$runInIsolation$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ int $priority;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i10, Ia.l<? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> lVar, kotlin.coroutines.c<? super SingleRunner$runInIsolation$2> cVar) {
        super(2, cVar);
        this.this$0 = singleRunner;
        this.$priority = i10;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.this$0, this.$priority, this.$block, cVar);
        singleRunner$runInIsolation$2.L$0 = obj;
        return singleRunner$runInIsolation$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SingleRunner$runInIsolation$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.i0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.i0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$a] */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.SingleRunner$a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2694i0 interfaceC2694i0;
        ?? r10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r11 = this.label;
        int i10 = 4;
        try {
            if (r11 != 0) {
                if (r11 == 1) {
                    InterfaceC2694i0 interfaceC2694i1 = (InterfaceC2694i0) this.L$0;
                    kotlin.b.b(obj);
                    interfaceC2694i0 = interfaceC2694i1;
                } else if (r11 == 2) {
                    InterfaceC2694i0 interfaceC2694i2 = (InterfaceC2694i0) this.L$0;
                    kotlin.b.b(obj);
                    r11 = interfaceC2694i2;
                    r11 = interfaceC2694i0;
                    r10 = this.this$0.f19324a;
                    i10 = 0;
                    this.L$0 = null;
                    this.label = 3;
                    if (r10.a(r11, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (r11 != 3) {
                        if (r11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.L$0;
                        kotlin.b.b(obj);
                        throw th;
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            kotlin.coroutines.e.a aVar = ((kotlinx.coroutines.A) this.L$0).getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
            if (aVar == null) {
                throw new IllegalStateException("Internal error. coroutineScope should've created a job.");
            }
            InterfaceC2694i0 interfaceC2694i3 = (InterfaceC2694i0) aVar;
            SingleRunner.a aVar2 = this.this$0.f19324a;
            int i11 = this.$priority;
            this.L$0 = interfaceC2694i3;
            this.label = 1;
            Object objB = aVar2.b(i11, interfaceC2694i3, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2694i0 = interfaceC2694i3;
            obj = objB;
            if (((Boolean) obj).booleanValue()) {
                Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> lVar = this.$block;
                this.L$0 = interfaceC2694i0;
                this.label = 2;
                if (lVar.invoke(this) == coroutineSingletons) {
                    r11 = interfaceC2694i0;
                    return coroutineSingletons;
                }
                r11 = interfaceC2694i0;
                r10 = this.this$0.f19324a;
                i10 = 0;
                this.L$0 = null;
                this.label = 3;
                if (r10.a(r11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        } catch (Throwable th2) {
            ?? r12 = this.this$0.f19324a;
            this.L$0 = th2;
            this.label = i10;
            if (r12.a(r11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw th2;
        }
    }
}
