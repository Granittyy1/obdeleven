package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.HttpUriFetcher;
import coil.fetch.i;
import coil.fetch.k;
import coil.request.NullRequestDataException;
import coil.request.h;
import coil.request.m;
import coil.request.n;
import coil.request.o;
import coil.util.j;
import coil.util.s;
import coil.util.v;
import com.google.android.gms.internal.measurement.M1;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.B;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.q;
import okhttp3.p;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RealImageLoader implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.b f22691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p293xa.g<X2.b> f22692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f22693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.internal.f f22694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f22695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f22696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22697h;

    public RealImageLoader(Context context, coil.request.b bVar, p293xa.g gVar, p293xa.g gVar2, p293xa.g gVar3, a aVar, s sVar) {
        this.f22690a = context;
        this.f22691b = bVar;
        this.f22692c = gVar;
        this.f22693d = sVar;
        B0 b0A = M1.a();
        Sa.b bVar2 = N.f43198a;
        this.f22694e = B.a(kotlin.coroutines.e.a.C0479a.d(b0A, q.f43500a.d1()).plus(new g(this)));
        v vVar = new v(this);
        n nVar = new n(this, vVar);
        this.f22695f = nVar;
        a.C0238a c0238a = new a.C0238a(aVar);
        c0238a.a(new W2.c(), p.class);
        c0238a.a(new W2.g(), String.class);
        c0238a.a(new W2.b(), Uri.class);
        c0238a.a(new W2.f(), Uri.class);
        c0238a.a(new W2.e(), Integer.class);
        c0238a.a(new W2.a(), byte[].class);
        V2.c cVar = new V2.c();
        ArrayList arrayList = c0238a.f22705c;
        arrayList.add(new Pair(cVar, Uri.class));
        arrayList.add(new Pair(new V2.a(sVar.f23171a), File.class));
        c0238a.b(new HttpUriFetcher.a(gVar3, gVar2, sVar.f23173c), Uri.class);
        c0238a.b(new i.a(), File.class);
        c0238a.b(new coil.fetch.a.C0241a(), Uri.class);
        c0238a.b(new coil.fetch.d.a(), Uri.class);
        c0238a.b(new k.a(), Uri.class);
        c0238a.b(new coil.fetch.e.a(), Drawable.class);
        c0238a.b(new coil.fetch.b.a(), Bitmap.class);
        c0238a.b(new coil.fetch.c.a(), ByteBuffer.class);
        c0238a.f22707e.add(new BitmapFactoryDecoder.b(sVar.f23174d, sVar.f23175e));
        a aVarC = c0238a.c();
        this.f22696g = aVarC;
        this.f22697h = kotlin.collections.q.d0(aVarC.f22698a, new coil.intercept.b(this, vVar, nVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f9 A[Catch: all -> 0x00f6, PHI: r1 r2 r3 r4
      0x00f9: PHI (r1v17 coil.RealImageLoader) = (r1v4 coil.RealImageLoader), (r1v18 coil.RealImageLoader), (r1v19 coil.RealImageLoader) binds: [B:26:0x0093, B:35:0x00e0, B:37:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r2v9 coil.b) = (r2v3 coil.b), (r2v15 coil.b), (r2v16 coil.b) binds: [B:26:0x0093, B:35:0x00e0, B:37:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r3v13 coil.request.g) = (r3v19 coil.request.g), (r3v20 coil.request.g), (r3v21 coil.request.g) binds: [B:26:0x0093, B:35:0x00e0, B:37:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r4v12 coil.request.m) = (r4v23 coil.request.m), (r4v24 coil.request.m), (r4v25 coil.request.m) binds: [B:26:0x0093, B:35:0x00e0, B:37:0x00f2] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0112 A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161 A[Catch: all -> 0x00f6, PHI: r0 r1 r2 r3 r4
      0x0161: PHI (r0v18 java.lang.Object) = (r0v14 java.lang.Object), (r0v28 java.lang.Object) binds: [B:16:0x004c, B:55:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r1v15 coil.RealImageLoader) = (r1v11 coil.RealImageLoader), (r1v21 coil.RealImageLoader) binds: [B:16:0x004c, B:55:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r2v7 coil.b) = (r2v5 coil.b), (r2v18 coil.b) binds: [B:16:0x004c, B:55:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r3v11 coil.request.g) = (r3v24 coil.request.g), (r3v25 coil.request.g) binds: [B:16:0x004c, B:55:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r4v10 coil.request.m) = (r4v28 coil.request.m), (r4v29 coil.request.m) binds: [B:16:0x004c, B:55:0x015d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0168 A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x017a A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x017e A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x018b  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0199 A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x019d A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0 A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #1 {all -> 0x00f6, blocks: (B:57:0x0161, B:59:0x0168, B:62:0x017a, B:67:0x0192, B:69:0x0199, B:63:0x017e, B:66:0x018c, B:70:0x019d, B:72:0x01a1, B:74:0x01b0, B:75:0x01b5, B:54:0x0137, B:41:0x00f9, B:43:0x00ff, B:44:0x0102, B:46:0x0112, B:47:0x0115, B:49:0x011c, B:50:0x011f, B:32:0x00d7, B:34:0x00dd, B:36:0x00e2, B:76:0x01b6, B:77:0x01bb), top: B:92:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c0 A[Catch: all -> 0x01ce, TryCatch #2 {all -> 0x01ce, blocks: (B:78:0x01bc, B:80:0x01c0, B:82:0x01ca, B:83:0x01cd, B:86:0x01d0), top: B:93:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca A[Catch: all -> 0x01ce, TryCatch #2 {all -> 0x01ce, blocks: (B:78:0x01bc, B:80:0x01c0, B:82:0x01ca, B:83:0x01cd, B:86:0x01d0), top: B:93:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0 A[Catch: all -> 0x01ce, TRY_LEAVE, TryCatch #2 {all -> 0x01ce, blocks: (B:78:0x01bc, B:80:0x01c0, B:82:0x01ca, B:83:0x01cd, B:86:0x01d0), top: B:93:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [coil.RealImageLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [coil.request.g$b] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [coil.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [coil.request.g] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v8, types: [coil.request.m] */
    /* JADX WARN: Type inference failed for: r4v9, types: [coil.request.m] */
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
    public static final Object d(RealImageLoader realImageLoader, coil.request.g gVar, int i10, ContinuationImpl continuationImpl) {
        RealImageLoader$executeMain$1 realImageLoader$executeMain$1;
        int i11;
        ?? r10;
        ?? r11;
        b bVar;
        RealImageLoader realImageLoader2;
        Bitmap bitmap;
        Object objE;
        b bVar2;
        RealImageLoader realImageLoader3;
        Object objF;
        b bVar3;
        RealImageLoader realImageLoader4;
        ?? r12;
        ?? r13;
        ?? r14;
        h hVar;
        ?? r15;
        m mVar;
        coil.request.g gVar2;
        h hVar2;
        o oVar;
        p004a3.b bVar4;
        coil.request.g gVar3;
        boolean z10;
        Drawable drawable;
        p029c3.c cVarA;
        coil.request.g.b bVar5;
        m mVar2;
        coil.request.g gVar4;
        m mVar3;
        coil.request.g gVar5;
        Drawable drawableB;
        p004a3.b bVar6;
        coil.request.g.b bVar7;
        Object obj;
        m qVar;
        coil.request.g gVarA;
        b.a aVar;
        int i12;
        RealImageLoader realImageLoader5 = realImageLoader;
        realImageLoader.getClass();
        if (continuationImpl instanceof RealImageLoader$executeMain$1) {
            realImageLoader$executeMain$1 = (RealImageLoader$executeMain$1) continuationImpl;
            i12 = realImageLoader$executeMain$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                int i13 = i12 - Integer.MIN_VALUE;
                realImageLoader$executeMain$1.label = i13;
                i11 = i13;
            } else {
                realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(realImageLoader5, continuationImpl);
                i11 = i12;
            }
        } else {
            realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(realImageLoader5, continuationImpl);
            i11 = i12;
        }
        RealImageLoader$executeMain$1 realImageLoader$executeMain$2 = realImageLoader$executeMain$1;
        Object obj2 = realImageLoader$executeMain$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i14 = realImageLoader$executeMain$2.label;
        if (i14 != 0) {
            try {
                if (i14 == 1) {
                    b bVar8 = (b) realImageLoader$executeMain$2.L$3;
                    coil.request.g gVar6 = (coil.request.g) realImageLoader$executeMain$2.L$2;
                    m mVar4 = (m) realImageLoader$executeMain$2.L$1;
                    RealImageLoader realImageLoader6 = (RealImageLoader) realImageLoader$executeMain$2.L$0;
                    kotlin.b.b(obj2);
                    bVar = bVar8;
                    realImageLoader2 = realImageLoader6;
                    gVar5 = gVar6;
                    mVar3 = mVar4;
                    realImageLoader2 = realImageLoader5;
                    bVar = aVar;
                    gVar5 = gVarA;
                    mVar3 = qVar;
                    realImageLoader2 = realImageLoader5;
                    bVar = aVar;
                    gVar5 = gVarA;
                    mVar3 = qVar;
                    realImageLoader2 = realImageLoader5;
                    bVar = aVar;
                    gVar5 = gVarA;
                    mVar3 = qVar;
                    if (realImageLoader2.e() != null) {
                        gVar5.getClass();
                    }
                    drawableB = j.b(gVar5, gVar5.f23041C, gVar5.f23040B, gVar5.f23045G.j);
                    bVar6 = gVar5.f23048c;
                    if (bVar6 != null) {
                        bVar6.onStart(drawableB);
                    }
                    bVar.getClass();
                    bVar7 = gVar5.f23049d;
                    if (bVar7 != null) {
                        bVar7.onStart(gVar5);
                    }
                    Z2.f fVar = gVar5.f23069y;
                    realImageLoader$executeMain$2.L$0 = realImageLoader2;
                    realImageLoader$executeMain$2.L$1 = mVar3;
                    realImageLoader$executeMain$2.L$2 = gVar5;
                    realImageLoader$executeMain$2.L$3 = bVar;
                    realImageLoader$executeMain$2.L$4 = null;
                    realImageLoader$executeMain$2.label = 2;
                    objE = fVar.e(realImageLoader$executeMain$2);
                    if (objE == coroutineSingletons) {
                        obj = coroutineSingletons;
                    } else {
                        bitmap = null;
                        realImageLoader3 = realImageLoader2;
                        bVar2 = bVar;
                        gVar4 = gVar5;
                        mVar2 = mVar3;
                        Z2.e eVar = (Z2.e) objE;
                        bVar2.getClass();
                        AbstractC2712w abstractC2712w = gVar4.f23064t;
                        RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(gVar4, realImageLoader3, eVar, bVar2, bitmap, null);
                        realImageLoader$executeMain$2.L$0 = realImageLoader3;
                        realImageLoader$executeMain$2.L$1 = mVar2;
                        realImageLoader$executeMain$2.L$2 = gVar4;
                        realImageLoader$executeMain$2.L$3 = bVar2;
                        realImageLoader$executeMain$2.L$4 = null;
                        realImageLoader$executeMain$2.label = 3;
                        objF = C2680e.f(abstractC2712w, realImageLoader$executeMain$result$1, realImageLoader$executeMain$2);
                        realImageLoader4 = realImageLoader3;
                        bVar3 = bVar2;
                        gVar2 = gVar4;
                        mVar = mVar2;
                        if (objF == coroutineSingletons) {
                            obj = coroutineSingletons;
                        }
                    }
                } else if (i14 == 2) {
                    Bitmap bitmap2 = (Bitmap) realImageLoader$executeMain$2.L$4;
                    b bVar9 = (b) realImageLoader$executeMain$2.L$3;
                    coil.request.g gVar7 = (coil.request.g) realImageLoader$executeMain$2.L$2;
                    m mVar5 = (m) realImageLoader$executeMain$2.L$1;
                    RealImageLoader realImageLoader7 = (RealImageLoader) realImageLoader$executeMain$2.L$0;
                    kotlin.b.b(obj2);
                    bitmap = bitmap2;
                    objE = obj2;
                    bVar2 = bVar9;
                    realImageLoader3 = realImageLoader7;
                    gVar4 = gVar7;
                    mVar2 = mVar5;
                    Z2.e eVar2 = (Z2.e) objE;
                    bVar2.getClass();
                    AbstractC2712w abstractC2712w2 = gVar4.f23064t;
                    RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$2 = new RealImageLoader$executeMain$result$1(gVar4, realImageLoader3, eVar2, bVar2, bitmap, null);
                    realImageLoader$executeMain$2.L$0 = realImageLoader3;
                    realImageLoader$executeMain$2.L$1 = mVar2;
                    realImageLoader$executeMain$2.L$2 = gVar4;
                    realImageLoader$executeMain$2.L$3 = bVar2;
                    realImageLoader$executeMain$2.L$4 = null;
                    realImageLoader$executeMain$2.label = 3;
                    objF = C2680e.f(abstractC2712w2, realImageLoader$executeMain$result$2, realImageLoader$executeMain$2);
                    realImageLoader4 = realImageLoader3;
                    bVar3 = bVar2;
                    gVar2 = gVar4;
                    mVar = mVar2;
                    if (objF == coroutineSingletons) {
                        obj = coroutineSingletons;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar10 = (b) realImageLoader$executeMain$2.L$3;
                    coil.request.g gVar8 = (coil.request.g) realImageLoader$executeMain$2.L$2;
                    m mVar6 = (m) realImageLoader$executeMain$2.L$1;
                    RealImageLoader realImageLoader8 = (RealImageLoader) realImageLoader$executeMain$2.L$0;
                    kotlin.b.b(obj2);
                    objF = obj2;
                    bVar3 = bVar10;
                    realImageLoader4 = realImageLoader8;
                    gVar2 = gVar8;
                    mVar = mVar6;
                }
                hVar2 = (h) objF;
                if (hVar2 instanceof o) {
                    oVar = (o) hVar2;
                    bVar4 = gVar2.f23048c;
                    realImageLoader4.getClass();
                    gVar3 = oVar.f23121b;
                    z10 = bVar4 instanceof p029c3.d;
                    drawable = oVar.f23120a;
                    if (z10) {
                        cVarA = gVar3.j.a((p029c3.d) bVar4, oVar);
                        if (cVarA instanceof p029c3.b) {
                            bVar4.onSuccess(drawable);
                        } else {
                            bVar3.getClass();
                            cVarA.a();
                        }
                    } else if (bVar4 != null) {
                        bVar4.onSuccess(drawable);
                    }
                    bVar3.getClass();
                    bVar5 = gVar3.f23049d;
                    r15 = mVar;
                    hVar = hVar2;
                    if (bVar5 != null) {
                        bVar5.onSuccess(gVar3, oVar);
                        r15 = mVar;
                        hVar = hVar2;
                    }
                } else {
                    if (!(hVar2 instanceof coil.request.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p004a3.b bVar11 = gVar2.f23048c;
                    realImageLoader4.getClass();
                    f((coil.request.e) hVar2, bVar11, bVar3);
                    r15 = mVar;
                    hVar = hVar2;
                }
            } catch (Throwable th) {
                th = th;
                r10 = realImageLoader5;
                r11 = -2147483648;
                r13 = i14;
                r12 = i11;
                try {
                    if (th instanceof CancellationException) {
                        r11.getClass();
                        r10.getClass();
                        r14 = r13.f23049d;
                        if (r14 != 0) {
                            r14.onCancel(r13);
                        }
                        throw th;
                    }
                    r11.f22695f.getClass();
                    coil.request.e eVarA = n.a(r13, th);
                    f(eVarA, r13.f23048c, r10);
                    r15 = r12;
                    hVar = eVarA;
                } catch (Throwable th2) {
                    r12.b();
                    throw th2;
                }
            }
            r15.b();
            obj = hVar;
        } else {
            kotlin.b.b(obj2);
            InterfaceC2694i0 interfaceC2694i0F = C2702l0.f(realImageLoader$executeMain$2.getContext());
            n nVar = realImageLoader5.f22695f;
            nVar.getClass();
            Lifecycle lifecycle = gVar.f23068x;
            p004a3.b bVar12 = gVar.f23048c;
            qVar = bVar12 instanceof p004a3.c ? new coil.request.q(nVar.f23117a, gVar, (p004a3.c) bVar12, lifecycle, interfaceC2694i0F) : new coil.request.a(lifecycle, interfaceC2694i0F);
            qVar.i();
            coil.request.g.a aVarA = coil.request.g.a(gVar);
            aVarA.f23073b = realImageLoader5.f22691b;
            aVarA.f23071A = null;
            gVarA = aVarA.a();
            aVar = b.f22708a;
            try {
                if (gVarA.f23047b == coil.request.i.f23097a) {
                    throw new NullRequestDataException();
                }
                qVar.start();
                if (i10 == 0) {
                    Lifecycle lifecycle2 = gVarA.f23068x;
                    realImageLoader$executeMain$2.L$0 = realImageLoader5;
                    realImageLoader$executeMain$2.L$1 = qVar;
                    realImageLoader$executeMain$2.L$2 = gVarA;
                    realImageLoader$executeMain$2.L$3 = aVar;
                    realImageLoader$executeMain$2.label = 1;
                    if (coil.util.i.a(lifecycle2, realImageLoader$executeMain$2) == coroutineSingletons) {
                        realImageLoader2 = realImageLoader5;
                        bVar = aVar;
                        gVar5 = gVarA;
                        mVar3 = qVar;
                        realImageLoader2 = realImageLoader5;
                        bVar = aVar;
                        gVar5 = gVarA;
                        mVar3 = qVar;
                        obj = coroutineSingletons;
                    } else {
                        realImageLoader2 = realImageLoader5;
                        bVar = aVar;
                        gVar5 = gVarA;
                        mVar3 = qVar;
                        realImageLoader2 = realImageLoader5;
                        bVar = aVar;
                        gVar5 = gVarA;
                        mVar3 = qVar;
                        realImageLoader2 = realImageLoader5;
                        bVar = aVar;
                        gVar5 = gVarA;
                        mVar3 = qVar;
                        if (realImageLoader2.e() != null) {
                            gVar5.getClass();
                        }
                        drawableB = j.b(gVar5, gVar5.f23041C, gVar5.f23040B, gVar5.f23045G.j);
                        bVar6 = gVar5.f23048c;
                        if (bVar6 != null) {
                            bVar6.onStart(drawableB);
                        }
                        bVar.getClass();
                        bVar7 = gVar5.f23049d;
                        if (bVar7 != null) {
                            bVar7.onStart(gVar5);
                        }
                        Z2.f fVar2 = gVar5.f23069y;
                        realImageLoader$executeMain$2.L$0 = realImageLoader2;
                        realImageLoader$executeMain$2.L$1 = mVar3;
                        realImageLoader$executeMain$2.L$2 = gVar5;
                        realImageLoader$executeMain$2.L$3 = bVar;
                        realImageLoader$executeMain$2.L$4 = null;
                        realImageLoader$executeMain$2.label = 2;
                        objE = fVar2.e(realImageLoader$executeMain$2);
                        if (objE == coroutineSingletons) {
                            obj = coroutineSingletons;
                        } else {
                            bitmap = null;
                            realImageLoader3 = realImageLoader2;
                            bVar2 = bVar;
                            gVar4 = gVar5;
                            mVar2 = mVar3;
                            Z2.e eVar3 = (Z2.e) objE;
                            bVar2.getClass();
                            AbstractC2712w abstractC2712w3 = gVar4.f23064t;
                            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$3 = new RealImageLoader$executeMain$result$1(gVar4, realImageLoader3, eVar3, bVar2, bitmap, null);
                            realImageLoader$executeMain$2.L$0 = realImageLoader3;
                            realImageLoader$executeMain$2.L$1 = mVar2;
                            realImageLoader$executeMain$2.L$2 = gVar4;
                            realImageLoader$executeMain$2.L$3 = bVar2;
                            realImageLoader$executeMain$2.L$4 = null;
                            realImageLoader$executeMain$2.label = 3;
                            objF = C2680e.f(abstractC2712w3, realImageLoader$executeMain$result$3, realImageLoader$executeMain$2);
                            realImageLoader4 = realImageLoader3;
                            bVar3 = bVar2;
                            gVar2 = gVar4;
                            mVar = mVar2;
                            if (objF == coroutineSingletons) {
                                obj = coroutineSingletons;
                            } else {
                                hVar2 = (h) objF;
                                if (hVar2 instanceof o) {
                                    oVar = (o) hVar2;
                                    bVar4 = gVar2.f23048c;
                                    realImageLoader4.getClass();
                                    gVar3 = oVar.f23121b;
                                    z10 = bVar4 instanceof p029c3.d;
                                    drawable = oVar.f23120a;
                                    if (z10) {
                                        cVarA = gVar3.j.a((p029c3.d) bVar4, oVar);
                                        if (cVarA instanceof p029c3.b) {
                                            bVar4.onSuccess(drawable);
                                        } else {
                                            bVar3.getClass();
                                            cVarA.a();
                                        }
                                    } else if (bVar4 != null) {
                                        bVar4.onSuccess(drawable);
                                    }
                                    bVar3.getClass();
                                    bVar5 = gVar3.f23049d;
                                    r15 = mVar;
                                    hVar = hVar2;
                                    if (bVar5 != null) {
                                        bVar5.onSuccess(gVar3, oVar);
                                        r15 = mVar;
                                        hVar = hVar2;
                                    }
                                } else {
                                    if (!(hVar2 instanceof coil.request.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    p004a3.b bVar13 = gVar2.f23048c;
                                    realImageLoader4.getClass();
                                    f((coil.request.e) hVar2, bVar13, bVar3);
                                    r15 = mVar;
                                    hVar = hVar2;
                                }
                                r15.b();
                                obj = hVar;
                            }
                        }
                    }
                } else {
                    realImageLoader2 = realImageLoader5;
                    bVar = aVar;
                    gVar5 = gVarA;
                    mVar3 = qVar;
                    realImageLoader2 = realImageLoader5;
                    bVar = aVar;
                    gVar5 = gVarA;
                    mVar3 = qVar;
                    realImageLoader2 = realImageLoader5;
                    bVar = aVar;
                    gVar5 = gVarA;
                    mVar3 = qVar;
                    if (realImageLoader2.e() != null) {
                        gVar5.getClass();
                    }
                    drawableB = j.b(gVar5, gVar5.f23041C, gVar5.f23040B, gVar5.f23045G.j);
                    bVar6 = gVar5.f23048c;
                    if (bVar6 != null) {
                        bVar6.onStart(drawableB);
                    }
                    bVar.getClass();
                    bVar7 = gVar5.f23049d;
                    if (bVar7 != null) {
                        bVar7.onStart(gVar5);
                    }
                    Z2.f fVar3 = gVar5.f23069y;
                    realImageLoader$executeMain$2.L$0 = realImageLoader2;
                    realImageLoader$executeMain$2.L$1 = mVar3;
                    realImageLoader$executeMain$2.L$2 = gVar5;
                    realImageLoader$executeMain$2.L$3 = bVar;
                    realImageLoader$executeMain$2.L$4 = null;
                    realImageLoader$executeMain$2.label = 2;
                    objE = fVar3.e(realImageLoader$executeMain$2);
                    if (objE == coroutineSingletons) {
                        obj = coroutineSingletons;
                    } else {
                        bitmap = null;
                        realImageLoader3 = realImageLoader2;
                        bVar2 = bVar;
                        gVar4 = gVar5;
                        mVar2 = mVar3;
                        Z2.e eVar4 = (Z2.e) objE;
                        bVar2.getClass();
                        AbstractC2712w abstractC2712w4 = gVar4.f23064t;
                        RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$4 = new RealImageLoader$executeMain$result$1(gVar4, realImageLoader3, eVar4, bVar2, bitmap, null);
                        realImageLoader$executeMain$2.L$0 = realImageLoader3;
                        realImageLoader$executeMain$2.L$1 = mVar2;
                        realImageLoader$executeMain$2.L$2 = gVar4;
                        realImageLoader$executeMain$2.L$3 = bVar2;
                        realImageLoader$executeMain$2.L$4 = null;
                        realImageLoader$executeMain$2.label = 3;
                        objF = C2680e.f(abstractC2712w4, realImageLoader$executeMain$result$4, realImageLoader$executeMain$2);
                        realImageLoader4 = realImageLoader3;
                        bVar3 = bVar2;
                        gVar2 = gVar4;
                        mVar = mVar2;
                        if (objF == coroutineSingletons) {
                            obj = coroutineSingletons;
                        } else {
                            hVar2 = (h) objF;
                            if (hVar2 instanceof o) {
                                oVar = (o) hVar2;
                                bVar4 = gVar2.f23048c;
                                realImageLoader4.getClass();
                                gVar3 = oVar.f23121b;
                                z10 = bVar4 instanceof p029c3.d;
                                drawable = oVar.f23120a;
                                if (z10) {
                                    cVarA = gVar3.j.a((p029c3.d) bVar4, oVar);
                                    if (cVarA instanceof p029c3.b) {
                                        bVar4.onSuccess(drawable);
                                    } else {
                                        bVar3.getClass();
                                        cVarA.a();
                                    }
                                } else if (bVar4 != null) {
                                    bVar4.onSuccess(drawable);
                                }
                                bVar3.getClass();
                                bVar5 = gVar3.f23049d;
                                r15 = mVar;
                                hVar = hVar2;
                                if (bVar5 != null) {
                                    bVar5.onSuccess(gVar3, oVar);
                                    r15 = mVar;
                                    hVar = hVar2;
                                }
                            } else {
                                if (!(hVar2 instanceof coil.request.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                p004a3.b bVar14 = gVar2.f23048c;
                                realImageLoader4.getClass();
                                f((coil.request.e) hVar2, bVar14, bVar3);
                                r15 = mVar;
                                hVar = hVar2;
                            }
                            r15.b();
                            obj = hVar;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r11 = realImageLoader5;
                r10 = aVar;
                r13 = gVarA;
                r12 = qVar;
                if (th instanceof CancellationException) {
                    r11.getClass();
                    r10.getClass();
                    r14 = r13.f23049d;
                    if (r14 != 0) {
                        r14.onCancel(r13);
                    }
                    throw th;
                }
                r11.f22695f.getClass();
                coil.request.e eVarA2 = n.a(r13, th);
                f(eVarA2, r13.f23048c, r10);
                r15 = r12;
                hVar = eVarA2;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static void f(coil.request.e eVar, p004a3.b bVar, b bVar2) {
        coil.request.g gVar = eVar.f23035b;
        boolean z10 = bVar instanceof p029c3.d;
        Drawable drawable = eVar.f23034a;
        if (z10) {
            p029c3.c cVarA = gVar.j.a((p029c3.d) bVar, eVar);
            if (cVarA instanceof p029c3.b) {
                bVar.onError(drawable);
            } else {
                bVar2.getClass();
                cVarA.a();
            }
        } else if (bVar != null) {
            bVar.onError(drawable);
        }
        bVar2.getClass();
        coil.request.g.b bVar3 = gVar.f23049d;
        if (bVar3 != null) {
            bVar3.onError(gVar, eVar);
        }
    }

    @Override // coil.f
    public final coil.request.b a() {
        return this.f22691b;
    }

    @Override // coil.f
    public final coil.request.d b(coil.request.g gVar) {
        G gA = C2680e.a(this.f22694e, null, new RealImageLoader$enqueue$job$1(this, gVar, null), 3);
        p004a3.b bVar = gVar.f23048c;
        return bVar instanceof p004a3.c ? coil.util.k.c(((p004a3.c) bVar).a()).a(gA) : new coil.request.j();
    }

    @Override // coil.f
    public final Object c(coil.request.g gVar, SuspendLambda suspendLambda) {
        if (gVar.f23048c instanceof p004a3.c) {
            return B.d(new RealImageLoader$execute$2(this, gVar, null), suspendLambda);
        }
        Sa.b bVar = N.f43198a;
        return C2680e.f(q.f43500a.d1(), new RealImageLoader$execute$3(this, gVar, null), suspendLambda);
    }

    public final X2.b e() {
        return this.f22692c.getValue();
    }
}
