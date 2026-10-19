package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.braze.Constants;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21552e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f21556d;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.m6$a$a, reason: collision with other inner class name */
        public static final class C0225a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File[] f21557b;

            /* JADX INFO: renamed from: bo.app.m6$a$a$a, reason: collision with other inner class name */
            public static final class C0226a extends Lambda implements Ia.l {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0226a f21558b = new C0226a();

                public C0226a() {
                    super(1);
                }

                @Override // Ia.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(File file) {
                    String name = file.getName();
                    kotlin.jvm.internal.i.d(name, "it.name");
                    return name;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0225a(File[] fileArr) {
                super(0);
                this.f21557b = fileArr;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Local triggered asset directory contains files: ".concat(kotlin.collections.k.V(this.f21557b, " , ", C0226a.f21558b, 30));
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f21559b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(File file) {
                super(0);
                this.f21559b = file;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Deleting obsolete asset '" + this.f21559b.getPath() + "' from filesystem.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f21560b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Exception while deleting obsolete assets from filesystem.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21561b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.f21561b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Q8.d.a(new StringBuilder("Not removing local path for remote path "), this.f21561b, " from cache because it is being preserved until the end of the app run.");
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21562b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21563c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, String str2) {
                super(0);
                this.f21562b = str;
                this.f21563c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder("Removing obsolete local path ");
                sb2.append(this.f21562b);
                sb2.append(" for obsolete remote path ");
                return Q8.d.a(sb2, this.f21563c, " from cache.");
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f21564b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(File file) {
                super(0);
                this.f21564b = file;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Deleting triggers directory at: " + this.f21564b.getAbsolutePath();
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f21565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21566c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Ref$ObjectRef ref$ObjectRef, String str) {
                super(0);
                this.f21565b = ref$ObjectRef;
                this.f21566c = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Using file extension " + ((String) this.f21565b.element) + " for remote asset url: " + this.f21566c;
            }
        }

        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21568c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, String str2) {
                super(0);
                this.f21567b = str;
                this.f21568c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder("Retrieving trigger local asset path '");
                sb2.append(this.f21567b);
                sb2.append("' from local storage for remote path '");
                return B7.b.g(sb2, this.f21568c, '\'');
            }
        }

        public static final class i extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21569b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str) {
                super(0);
                this.f21569b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return B7.b.g(new StringBuilder("Encountered unexpected exception while parsing stored triggered action local assets on remote asset '"), this.f21569b, '\'');
            }
        }

        public static final class j extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c3 f21570b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(c3 c3Var) {
                super(0);
                this.f21570b = c3Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Pre-fetch off for triggered action " + this.f21570b.getId() + ". Not pre-fetching assets.";
            }
        }

        public static final class k extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c3 f21571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21572c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(c3 c3Var, String str) {
                super(0);
                this.f21571b = c3Var;
                this.f21572c = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder("Received new remote path for triggered action ");
                sb2.append(this.f21571b.getId());
                sb2.append(" at ");
                return B7.b.g(sb2, this.f21572c, '.');
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final void a(Context context) {
            kotlin.jvm.internal.i.e(context, "context");
            File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new f(file), 2, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object, java.lang.String] */
        public final String b(String remoteAssetUrl) {
            String lastPathSegment;
            int iU;
            kotlin.jvm.internal.i.e(remoteAssetUrl, "remoteAssetUrl");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "";
            Uri uri = Uri.parse(remoteAssetUrl);
            if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null && lastPathSegment.length() != 0 && (iU = kotlin.text.n.U(lastPathSegment, '.', 0, 6)) > -1) {
                ?? Substring = lastPathSegment.substring(iU);
                kotlin.jvm.internal.i.d(Substring, "this as java.lang.String).substring(startIndex)");
                ref$ObjectRef.element = Substring;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, m6.f21552e, BrazeLogger.Priority.V, (Throwable) null, new g(ref$ObjectRef, remoteAssetUrl), 2, (Object) null);
            }
            return IntentUtils.getRequestCode() + ((String) ref$ObjectRef.element);
        }

        private a() {
        }

        public final void a(File triggeredAssetDirectory, Map remoteToLocalAssetsMap, Map preservedLocalAssetMap) {
            kotlin.jvm.internal.i.e(triggeredAssetDirectory, "triggeredAssetDirectory");
            kotlin.jvm.internal.i.e(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
            kotlin.jvm.internal.i.e(preservedLocalAssetMap, "preservedLocalAssetMap");
            File[] fileArrListFiles = triggeredAssetDirectory.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0225a(fileArrListFiles), 2, (Object) null);
            try {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!preservedLocalAssetMap.containsValue(((File) obj).getPath())) {
                        arrayList2.add(obj);
                    }
                }
                for (File obsoleteFile : arrayList2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, m6.f21552e, (BrazeLogger.Priority) null, (Throwable) null, new b(obsoleteFile), 3, (Object) null);
                    kotlin.jvm.internal.i.d(obsoleteFile, "obsoleteFile");
                    BrazeFileUtils.deleteFileOrDirectory(obsoleteFile);
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f21560b);
            }
        }

        public final Map a(SharedPreferences storagePrefs) {
            kotlin.jvm.internal.i.e(storagePrefs, "storagePrefs");
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Map<String, ?> all = storagePrefs.getAll();
            if (all != null && !all.isEmpty()) {
                for (String remoteAssetKey : all.keySet()) {
                    try {
                        String string = storagePrefs.getString(remoteAssetKey, null);
                        if (string != null && !kotlin.text.n.S(string)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(string, remoteAssetKey), 3, (Object) null);
                            kotlin.jvm.internal.i.d(remoteAssetKey, "remoteAssetKey");
                            concurrentHashMap.put(remoteAssetKey, string);
                        }
                    } catch (Exception e10) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new i(remoteAssetKey));
                    }
                }
            }
            return concurrentHashMap;
        }

        public final void a(SharedPreferences.Editor editor, Map localAssetPaths, Set newRemotePathStrings, Map preservedLocalAssetPathMap) {
            kotlin.jvm.internal.i.e(editor, "editor");
            kotlin.jvm.internal.i.e(localAssetPaths, "localAssetPaths");
            kotlin.jvm.internal.i.e(newRemotePathStrings, "newRemotePathStrings");
            kotlin.jvm.internal.i.e(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
            for (String str : new HashSet(localAssetPaths.keySet())) {
                if (preservedLocalAssetPathMap.containsKey(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str), 3, (Object) null);
                } else if (!newRemotePathStrings.contains(str)) {
                    localAssetPaths.remove(str);
                    editor.remove(str);
                    String str2 = (String) localAssetPaths.get(str);
                    if (str2 != null && !kotlin.text.n.S(str2)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str2, str), 3, (Object) null);
                        BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                    }
                }
            }
        }

        public final boolean a(String path) {
            kotlin.jvm.internal.i.e(path, "path");
            return new File(path).exists();
        }

        public final Pair a(List triggeredActions) {
            kotlin.jvm.internal.i.e(triggeredActions, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = triggeredActions.iterator();
            while (it.hasNext()) {
                c3 c3Var = (c3) it.next();
                if (!c3Var.d()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(c3Var), 3, (Object) null);
                } else {
                    for (w4 w4Var : c3Var.l()) {
                        String strB = w4Var.b();
                        if (!kotlin.text.n.S(strB)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(c3Var, strB), 3, (Object) null);
                            linkedHashSet.add(w4Var);
                            linkedHashSet2.add(strB);
                        }
                    }
                }
            }
            return new Pair(linkedHashSet, linkedHashSet2);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21573a;

        static {
            int[] iArr = new int[x4.values().length];
            try {
                iArr[x4.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x4.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x4.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21573a = iArr;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21575c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.f21574b = str;
            this.f21575c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storing local triggered action html zip asset at local path " + this.f21574b + " for remote path " + this.f21575c;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f21576b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to store html zip asset for remote path "), this.f21576b, ". Not storing local asset");
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f21577b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not download " + this.f21577b;
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f21579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Map map) {
            super(0);
            this.f21578b = str;
            this.f21579c = map;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not caching " + this.f21578b + " due to headers " + this.f21579c;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f21580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Uri uri, String str) {
            super(0);
            this.f21580b = uri;
            this.f21581c = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storing local triggered action asset at local path " + this.f21580b.getPath() + " for remote path " + this.f21581c;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21582b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f21582b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to store asset for remote path "), this.f21582b, ". Not storing local asset");
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f21583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c3 c3Var) {
            super(0);
            this.f21583b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: " + this.f21583b.getId();
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super(0);
            this.f21584b = str;
            this.f21585c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found local asset at path " + this.f21584b + " for remote asset at path: " + this.f21585c;
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.f21586b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not find local asset for remote path " + this.f21586b;
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f21587b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(c3 c3Var) {
            super(0);
            this.f21587b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No local assets found for action id: " + this.f21587b.getId();
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2) {
            super(0);
            this.f21588b = str;
            this.f21589c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Adding new local path '");
            sb2.append(this.f21588b);
            sb2.append("' for remote path '");
            return Q8.d.a(sb2, this.f21589c, "' to cache.");
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f21590b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add new local path for remote path " + this.f21590b;
        }
    }

    public m6(Context context, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.local_assets.".concat(apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f21553a = sharedPreferences;
        this.f21554b = f21552e.a(sharedPreferences);
        this.f21555c = new LinkedHashMap();
        this.f21556d = new File(context.getCacheDir().getPath() + "/ab_triggers");
    }

    @Override // bo.app.a3
    public void a(List triggeredActions) {
        kotlin.jvm.internal.i.e(triggeredActions, "triggeredActions");
        a aVar = f21552e;
        Pair pairA = aVar.a(triggeredActions);
        Set set = (Set) pairA.a();
        Set set2 = (Set) pairA.b();
        SharedPreferences.Editor localAssetEditor = this.f21553a.edit();
        kotlin.jvm.internal.i.d(localAssetEditor, "localAssetEditor");
        aVar.a(localAssetEditor, this.f21554b, set2, this.f21555c);
        aVar.a(this.f21556d, this.f21554b, this.f21555c);
        ArrayList<w4> arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.f21554b.containsKey(((w4) obj).b())) {
                arrayList.add(obj);
            }
        }
        for (w4 w4Var : arrayList) {
            String strB = w4Var.b();
            try {
                String strA = a(w4Var);
                if (strA != null && !kotlin.text.n.S(strA)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(strA, strB), 3, (Object) null);
                    this.f21554b.put(strB, strA);
                    localAssetEditor.putString(strB, strA);
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new n(strB));
            }
        }
        localAssetEditor.apply();
    }

    @Override // bo.app.v2
    public Map a(c3 triggeredAction) {
        kotlin.jvm.internal.i.e(triggeredAction, "triggeredAction");
        if (!triggeredAction.d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(triggeredAction), 3, (Object) null);
            return kotlin.collections.y.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = triggeredAction.l().iterator();
        while (it.hasNext()) {
            String strB = ((w4) it.next()).b();
            String str = (String) this.f21554b.get(strB);
            if (str != null && f21552e.a(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(str, strB), 3, (Object) null);
                this.f21555c.put(strB, str);
                linkedHashMap.put(strB, str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new k(strB), 2, (Object) null);
            }
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new l(triggeredAction), 2, (Object) null);
        }
        return linkedHashMap;
    }

    public final String a(w4 remotePath) {
        Long lA;
        kotlin.jvm.internal.i.e(remotePath, "remotePath");
        String strB = remotePath.b();
        int i10 = b.f21573a[remotePath.a().ordinal()];
        if (i10 == 1) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.f21556d, strB);
            if (localHtmlUrlFromRemoteUrl != null && !kotlin.text.n.S(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(localHtmlUrlFromRemoteUrl, strB), 2, (Object) null);
                return localHtmlUrlFromRemoteUrl;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(strB), 3, (Object) null);
            return null;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String strB2 = f21552e.b(strB);
        try {
            String string = this.f21556d.toString();
            kotlin.jvm.internal.i.d(string, "triggeredAssetDirectory.toString()");
            Pair pairDownloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(string, strB, strB2, null, 8, null);
            File file = (File) pairDownloadFileToPath$default.a();
            Map map = (Map) pairDownloadFileToPath$default.b();
            String str = (String) map.get("expires");
            if (str != null && (lA = com.braze.support.g.a(str)) != null && lA.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(strB, map), 3, (Object) null);
                return null;
            }
            Uri uriFromFile = Uri.fromFile(file);
            if (uriFromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(uriFromFile, strB), 2, (Object) null);
                return uriFromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(strB), 3, (Object) null);
            return null;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new e(strB));
            return null;
        }
    }
}
