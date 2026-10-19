package kotlinx.serialization.json.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Ia.q<p293xa.b<p293xa.r, p050db.h>, p293xa.r, kotlin.coroutines.c<? super p050db.h>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(u uVar, kotlin.coroutines.c<? super JsonTreeReader$readDeepRecursive$1> cVar) {
        super(3, cVar);
        this.this$0 = uVar;
    }

    @Override // Ia.q
    public final Object invoke(p293xa.b<p293xa.r, p050db.h> bVar, p293xa.r rVar, kotlin.coroutines.c<? super p050db.h> cVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, cVar);
        jsonTreeReader$readDeepRecursive$1.L$0 = bVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            p293xa.b bVar = (p293xa.b) this.L$0;
            byte bS = this.this$0.f44012a.s();
            if (bS == 1) {
                return this.this$0.d(true);
            }
            if (bS == 0) {
                return this.this$0.d(false);
            }
            if (bS != 6) {
                if (bS == 8) {
                    return this.this$0.c();
                }
                z.n(this.this$0.f44012a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            u uVar = this.this$0;
            this.label = 1;
            obj = u.a(uVar, bVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return (p050db.h) obj;
    }
}
