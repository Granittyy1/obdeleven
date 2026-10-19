package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import bo.app.C1467g;
import com.braze.Constants;
import com.braze.R;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final String BRAZE_LRU_CACHE_FOLDER = "appboy.imageloader.lru.cache";
    private static final int DISK_CACHE_SIZE = 52428800;
    private final ReentrantLock diskCacheLock;
    private C1467g diskLruCache;
    private boolean isDiskCacheStarting;
    private boolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;
    public static final b Companion = new b(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);

    public static final class a extends LruCache {
        public a(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap image) {
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(image, "image");
            return image.getByteCount();
        }
    }

    public static final class b {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f24060b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(File file) {
                super(0);
                this.f24060b = file;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Deleting lru image cache directory at: " + this.f24060b.getAbsolutePath();
            }
        }

        /* JADX INFO: renamed from: com.braze.images.DefaultBrazeImageLoader$b$b, reason: collision with other inner class name */
        public static final class C0247b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0247b f24061b = new C0247b();

            public C0247b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to delete stored data in image loader";
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final void a(Context context) {
            kotlin.jvm.internal.i.e(context, "context");
            try {
                File file = new File(context.getCacheDir(), DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(file), 2, (Object) null);
                BrazeFileUtils.deleteFileOrDirectory(file);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, C0247b.f24061b);
            }
        }

        private b() {
        }

        public final File a(Context context, String uniqueName) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(uniqueName, "uniqueName");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir().getPath());
            return new File(Q8.d.a(sb2, File.separator, uniqueName));
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DefaultBrazeImageLoader f24063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
            super(0);
            this.f24062b = str;
            this.f24063c = defaultBrazeImageLoader;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got bitmap from mem cache for key " + this.f24062b + "\nMemory cache stats: " + this.f24063c.getMemoryCache();
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f24064b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got bitmap from disk cache for key " + this.f24064b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f24065b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No cache hit for bitmap: " + this.f24065b;
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f24066b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Disk cache still starting. Cannot retrieve key from disk cache: " + this.f24066b;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f24067b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Getting bitmap from disk cache for key: " + this.f24067b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f24068b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot retrieve bitmap with blank image url";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24069b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cache is currently in offline mode. Not downloading bitmap.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f24070b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get bitmap from url. Url: " + this.f24070b;
        }
    }

    public static final class k extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f24072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DefaultBrazeImageLoader f24073d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f24074b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Initializing disk cache";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f24075b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Disk cache initialized";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f24076b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception creating new disk cache. Unable to create new disk cache";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f24072c = context;
            this.f24073d = defaultBrazeImageLoader;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((k) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new k(this.f24072c, this.f24073d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f24071b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            File fileA = DefaultBrazeImageLoader.Companion.a(this.f24072c, DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
            ReentrantLock reentrantLock = this.f24073d.diskCacheLock;
            DefaultBrazeImageLoader defaultBrazeImageLoader = this.f24073d;
            reentrantLock.lock();
            try {
                try {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) a.f24074b, 6, (Object) null);
                    defaultBrazeImageLoader.diskLruCache = new C1467g(fileA, 1, 1, 52428800L);
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) b.f24075b, 6, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                } catch (Exception e10) {
                    BrazeLogger.INSTANCE.brazelog(DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) c.f24076b);
                }
                p293xa.r rVar = p293xa.r.f47939a;
                return p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.f24077b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding bitmap to mem cache for key " + this.f24077b;
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.f24078b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Skipping disk cache for key: " + this.f24078b;
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24079b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f24079b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding bitmap to disk cache for key " + this.f24079b;
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f24080b = new o();

        public o() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot retrieve bitmap with a blank image url";
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.f24081b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to render url into view. Url: " + this.f24081b;
        }
    }

    public static final class q extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24083c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f24085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f24086f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BrazeViewBounds f24087g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ImageView f24088h;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24089b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f24089b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to retrieve bitmap from url: " + this.f24089b;
            }
        }

        public static final class b extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f24090b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f24091c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bitmap f24092d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ImageView imageView, Bitmap bitmap, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f24091c = imageView;
                this.f24092d = bitmap;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a10, kotlin.coroutines.c cVar) {
                return ((b) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new b(this.f24091c, this.f24092d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f24090b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                this.f24091c.setImageBitmap(this.f24092d);
                return p293xa.r.f47939a;
            }
        }

        public static final class c implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BrazeViewBounds f24093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bitmap f24094b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f24095c;

            public c(BrazeViewBounds brazeViewBounds, Bitmap bitmap, ImageView imageView) {
                this.f24093a = brazeViewBounds;
                this.f24094b = bitmap;
                this.f24095c = imageView;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                kotlin.jvm.internal.i.e(v10, "v");
                if (this.f24093a == BrazeViewBounds.BASE_CARD_VIEW) {
                    BrazeImageUtils.resizeImageViewToBitmapDimensions(this.f24094b, this.f24095c);
                }
                v10.removeOnLayoutChangeListener(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f24085e = context;
            this.f24086f = str;
            this.f24087g = brazeViewBounds;
            this.f24088h = imageView;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((q) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return DefaultBrazeImageLoader.this.new q(this.f24085e, this.f24086f, this.f24087g, this.f24088h, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f24083c;
            if (i10 == 0) {
                kotlin.b.b(obj);
                TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
                Bitmap bitmapFromUrl = DefaultBrazeImageLoader.this.getBitmapFromUrl(this.f24085e, this.f24086f, this.f24087g);
                if (bitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new a(this.f24086f), 6, (Object) null);
                } else {
                    String str = this.f24086f;
                    Object tag = this.f24088h.getTag(R.string.com_braze_image_lru_cache_image_url_key);
                    kotlin.jvm.internal.i.c(tag, "null cannot be cast to non-null type kotlin.String");
                    if (kotlin.jvm.internal.i.a(str, (String) tag)) {
                        Sa.b bVar = N.f43198a;
                        q0 q0Var = kotlinx.coroutines.internal.q.f43500a;
                        b bVar2 = new b(this.f24088h, bitmapFromUrl, null);
                        this.f24082b = bitmapFromUrl;
                        this.f24083c = 1;
                        if (C2680e.f(q0Var, bVar2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bitmap = bitmapFromUrl;
                    }
                }
                return p293xa.r.f47939a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) this.f24082b;
            kotlin.b.b(obj);
            this.f24088h.addOnLayoutChangeListener(new c(this.f24087g, bitmap, this.f24088h));
            return p293xa.r.f47939a;
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24096b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(boolean z10) {
            super(0);
            this.f24096b = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DefaultBrazeImageLoader outbound network requests are now ".concat(this.f24096b ? "disabled" : FeatureFlag.ENABLED);
        }
    }

    public DefaultBrazeImageLoader(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.memoryCache = new a(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    public static final void deleteStoredData(Context context) {
        Companion.a(context);
    }

    public static /* synthetic */ Bitmap downloadBitmapFromUrl$default(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return defaultBrazeImageLoader.downloadBitmapFromUrl(context, uri, brazeViewBounds);
    }

    public static final File getDiskCacheDir(Context context, String str) {
        return Companion.a(context, str);
    }

    private final void initDiskCacheTask(Context context) {
        C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new k(context, this, null), 3);
    }

    private final Bitmap putBitmapIntoMemCache(String str, Bitmap bitmap) {
        return this.memoryCache.put(str, bitmap);
    }

    private final void renderUrlIntoView(Context context, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        if (kotlin.text.n.S(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.f24080b, 3, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, brazeViewBounds, str);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new p(str));
        }
    }

    public final Bitmap downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds brazeViewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(imageUri, "imageUri");
        if (brazeViewBounds == null) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, brazeViewBounds);
    }

    public final Bitmap getBitmapFromCache(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(key, this), 2, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(key), 3, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(key), 2, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new f(key), 2, (Object) null);
            } else {
                C1467g c1467g = this.diskLruCache;
                if (c1467g == null) {
                    kotlin.jvm.internal.i.m("diskLruCache");
                    throw null;
                }
                if (c1467g.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(key), 2, (Object) null);
                    C1467g c1467g2 = this.diskLruCache;
                    if (c1467g2 == null) {
                        kotlin.jvm.internal.i.m("diskLruCache");
                        throw null;
                    }
                    Bitmap bitmapB = c1467g2.b(key);
                    reentrantLock.unlock();
                    return bitmapB;
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, String imageUrl, BrazeViewBounds brazeViewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(imageUrl, "imageUrl");
        if (kotlin.text.n.S(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.f24068b, 3, (Object) null);
            return null;
        }
        try {
            Bitmap bitmapFromCache = getBitmapFromCache(imageUrl);
            if (bitmapFromCache != null) {
                return bitmapFromCache;
            }
            if (this.isOffline) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.f24069b, 3, (Object) null);
            } else {
                Uri imageUri = Uri.parse(imageUrl);
                kotlin.jvm.internal.i.d(imageUri, "imageUri");
                Bitmap bitmapDownloadBitmapFromUrl = downloadBitmapFromUrl(context, imageUri, brazeViewBounds);
                if (bitmapDownloadBitmapFromUrl != null) {
                    putBitmapIntoCache(imageUrl, bitmapDownloadBitmapFromUrl, BrazeFileUtils.isLocalUri(imageUri));
                    return bitmapDownloadBitmapFromUrl;
                }
            }
            return null;
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new j(imageUrl));
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds brazeViewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(inAppMessage, "inAppMessage");
        kotlin.jvm.internal.i.e(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, brazeViewBounds);
    }

    public final LruCache<String, Bitmap> getMemoryCache() {
        return this.memoryCache;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String imageUrl, BrazeViewBounds brazeViewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, brazeViewBounds);
    }

    public final boolean isDiskCacheStarting() {
        return this.isDiskCacheStarting;
    }

    public final void putBitmapIntoCache(String key, Bitmap bitmap, boolean z10) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(bitmap, "bitmap");
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(key), 3, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(key), 3, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                C1467g c1467g = this.diskLruCache;
                if (c1467g == null) {
                    kotlin.jvm.internal.i.m("diskLruCache");
                    throw null;
                }
                if (!c1467g.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(key), 3, (Object) null);
                    C1467g c1467g2 = this.diskLruCache;
                    if (c1467g2 == null) {
                        kotlin.jvm.internal.i.m("diskLruCache");
                        throw null;
                    }
                    c1467g2.a(key, bitmap);
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(card, "card");
        kotlin.jvm.internal.i.e(imageUrl, "imageUrl");
        kotlin.jvm.internal.i.e(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(inAppMessage, "inAppMessage");
        kotlin.jvm.internal.i.e(imageUrl, "imageUrl");
        kotlin.jvm.internal.i.e(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, brazeViewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String imageUrl) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(imageView, "imageView");
        kotlin.jvm.internal.i.e(imageUrl, "imageUrl");
        imageView.setTag(R.string.com_braze_image_lru_cache_image_url_key, imageUrl);
        C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new q(context, imageUrl, brazeViewBounds, imageView, null), 3);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new r(z10), 2, (Object) null);
        this.isOffline = z10;
    }
}
