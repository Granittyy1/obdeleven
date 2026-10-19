package coil.intercept;

import Ia.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.RealImageLoader;
import coil.decode.DataSource;
import coil.request.g;
import coil.request.k;
import coil.request.o;
import coil.util.v;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
final class EngineInterceptor$intercept$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super o>, Object> {
    final /* synthetic */ X2.b.a $cacheKey;
    final /* synthetic */ c.a $chain;
    final /* synthetic */ coil.b $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ k $options;
    final /* synthetic */ g $request;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(b bVar, g gVar, Object obj, k kVar, coil.b bVar2, X2.b.a aVar, c.a aVar2, kotlin.coroutines.c<? super EngineInterceptor$intercept$2> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$request = gVar;
        this.$mappedData = obj;
        this.$options = kVar;
        this.$eventListener = bVar2;
        this.$cacheKey = aVar;
        this.$chain = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super o> cVar) {
        return ((EngineInterceptor$intercept$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        X2.b bVarE;
        Bitmap bitmap;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            g gVar = this.$request;
            Object obj2 = this.$mappedData;
            k kVar = this.$options;
            coil.b bVar2 = this.$eventListener;
            this.label = 1;
            obj = b.c(bVar, gVar, obj2, kVar, bVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        b.a aVar = (b.a) obj;
        v vVar = this.this$0.f22994b;
        synchronized (vVar) {
            try {
                RealImageLoader realImageLoader = vVar.f23179b.get();
                if (realImageLoader == null) {
                    vVar.b();
                } else if (vVar.f23180c == null) {
                    Context context = realImageLoader.f22690a;
                    vVar.f23180c = context;
                    context.registerComponentCallbacks(vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        X2.c cVar = this.this$0.f22996d;
        X2.b.a aVar2 = this.$cacheKey;
        if (!this.$request.f23061q.b() || (bVarE = cVar.f7176a.e()) == null || aVar2 == null) {
            z10 = false;
        } else {
            Drawable drawable = aVar.f22997a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z10 = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar.f22998b));
                String str = aVar.f23000d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                bVarE.c(aVar2, new X2.b.C0101b(bitmap, linkedHashMap));
                z10 = true;
            }
        }
        Drawable drawable2 = aVar.f22997a;
        g gVar2 = this.$request;
        DataSource dataSource = aVar.f22999c;
        X2.b.a aVar3 = z10 ? this.$cacheKey : null;
        String str2 = aVar.f23000d;
        boolean z11 = aVar.f22998b;
        c.a aVar4 = this.$chain;
        Bitmap.Config[] configArr = coil.util.k.f23160a;
        return new o(drawable2, gVar2, dataSource, aVar3, str2, z11, (aVar4 instanceof d) && ((d) aVar4).f23007g);
    }
}
