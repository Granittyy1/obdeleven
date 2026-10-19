package p165n4;

import Z3.q;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NativeProtocol.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f44914a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44915b = m.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f44916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f44917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Integer[] f44918e;

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static final class a extends e {
        @Override // n4.m.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // n4.m.e
        public final String c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static final class b extends e {
        @Override // n4.m.e
        public final String b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // n4.m.e
        public final String c() {
            return "com.instagram.android";
        }

        @Override // n4.m.e
        public final String d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static final class c extends e {
        @Override // n4.m.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // n4.m.e
        public final String c() {
            return "com.facebook.katana";
        }

        @Override // n4.m.e
        public final void e() {
            if (q.a().getApplicationInfo().targetSdkVersion >= 30) {
                m mVar = m.f44914a;
            }
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static final class d extends e {
        @Override // n4.m.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // n4.m.e
        public final String c() {
            return "com.facebook.orca";
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44920a;
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static final class g extends e {
        @Override // n4.m.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // n4.m.e
        public final String c() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        ArrayList arrayListN = l.n(new c(), new g());
        f44916c = arrayListN;
        ArrayList arrayListN2 = l.n(new a());
        arrayListN2.addAll(l.n(new c(), new g()));
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayListN);
        map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayListN);
        map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayListN);
        map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayListN);
        map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayListN2);
        map.put("com.facebook.platform.action.request.SHARE_STORY", arrayListN);
        f44917d = new AtomicBoolean(false);
        f44918e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final TreeSet a(m mVar, e eVar) {
        ProviderInfo providerInfoResolveContentProvider;
        mVar.getClass();
        String str = f44915b;
        TreeSet treeSet = new TreeSet();
        ContentResolver contentResolver = q.a().getContentResolver();
        String[] strArr = {"version"};
        Uri uri = Uri.parse("content://" + eVar.c() + ".provider.PlatformProvider/versions");
        i.d(uri, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
        Cursor cursorQuery = null;
        try {
            try {
                providerInfoResolveContentProvider = q.a().getPackageManager().resolveContentProvider(i.k(".provider.PlatformProvider", eVar.c()), 0);
            } catch (RuntimeException e10) {
                Log.e(str, "Failed to query content resolver.", e10);
                providerInfoResolveContentProvider = null;
            }
            if (providerInfoResolveContentProvider != null) {
                try {
                    try {
                        cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                    } catch (SecurityException unused) {
                        Log.e(str, "Failed to query content resolver.");
                    }
                } catch (IllegalArgumentException unused2) {
                    Log.e(str, "Failed to query content resolver.");
                } catch (NullPointerException unused3) {
                    Log.e(str, "Failed to query content resolver.");
                }
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return treeSet;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static Intent b(e eVar, String str, Collection collection, String str2, boolean z10, DefaultAudience defaultAudience, String str3, String str4, boolean z11, String str5, boolean z12, LoginTargetApp loginTargetApp, boolean z13, boolean z14, String str6) {
        String strB = eVar.b();
        if (strB == null) {
            return null;
        }
        Intent intentPutExtra = new Intent().setClassName(eVar.c(), strB).putExtra("client_id", str);
        i.d(intentPutExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
        q qVar = q.f7852a;
        intentPutExtra.putExtra("facebook_sdk_version", "16.2.0");
        if (collection != null && !collection.isEmpty()) {
            intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!s.y(str2)) {
            intentPutExtra.putExtra("e2e", str2);
        }
        intentPutExtra.putExtra("state", str3);
        intentPutExtra.putExtra("response_type", eVar.d());
        intentPutExtra.putExtra("nonce", str6);
        intentPutExtra.putExtra("return_scopes", "true");
        if (z10) {
            intentPutExtra.putExtra("default_audience", defaultAudience.a());
        }
        intentPutExtra.putExtra("legacy_override", q.d());
        intentPutExtra.putExtra("auth_type", str4);
        if (z11) {
            intentPutExtra.putExtra("fail_on_logged_out", true);
        }
        intentPutExtra.putExtra("messenger_page_id", str5);
        intentPutExtra.putExtra("reset_messenger_state", z12);
        if (z13) {
            intentPutExtra.putExtra("fx_app", loginTargetApp.toString());
        }
        if (z14) {
            intentPutExtra.putExtra("skip_dedupe", true);
        }
        return intentPutExtra;
    }

    public static final Intent c(Context context) {
        Intent intent;
        ResolveInfo resolveInfoResolveService;
        i.e(context, "context");
        Iterator it = f44916c.iterator();
        do {
            intent = null;
            if (!it.hasNext()) {
                break;
            }
            Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((e) it.next()).c()).addCategory("android.intent.category.DEFAULT");
            if (intentAddCategory != null && (resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0)) != null) {
                HashSet<String> hashSet = p165n4.g.f44886a;
                String str = resolveInfoResolveService.serviceInfo.packageName;
                i.d(str, "resolveInfo.serviceInfo.packageName");
                if (p165n4.g.a(context, str)) {
                    intent = intentAddCategory;
                }
            }
        } while (intent == null);
        return intent;
    }

    public static final Intent d(Intent intent, Bundle bundle, FacebookException facebookException) {
        String stringExtra;
        UUID uuidFromString;
        int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        if (k.M(Integer.valueOf(intExtra), f44918e) && intExtra >= 20140701) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (stringExtra != null) {
            try {
                uuidFromString = UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                uuidFromString = null;
            }
        } else {
            uuidFromString = null;
        }
        if (uuidFromString == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", uuidFromString.toString());
        if (facebookException != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("error_description", facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle3.putString("error_type", "UserCanceled");
            }
            bundle2.putBundle("error", bundle3);
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static final int e(int i10) {
        f fVar;
        int iMin;
        int[] iArr = {i10};
        f44914a.getClass();
        if (f44917d.compareAndSet(false, true)) {
            q.c().execute(new p068f4.b(1));
        }
        ArrayList<e> arrayList = f44916c;
        if (arrayList == null) {
            fVar = new f();
            fVar.f44920a = -1;
        } else {
            for (e eVar : arrayList) {
                TreeSet<Integer> treeSet = eVar.f44919a;
                if (treeSet == null || !Boolean.valueOf(treeSet.isEmpty()).equals(Boolean.FALSE)) {
                    eVar.a(false);
                }
                TreeSet<Integer> treeSet2 = eVar.f44919a;
                int iIntValue = f44918e[0].intValue();
                if (treeSet2 != null) {
                    Iterator<Integer> itDescendingIterator = treeSet2.descendingIterator();
                    int iMax = -1;
                    int i11 = 0;
                    while (true) {
                        if (itDescendingIterator.hasNext()) {
                            Integer fbAppVersion = itDescendingIterator.next();
                            i.d(fbAppVersion, "fbAppVersion");
                            iMax = Math.max(iMax, fbAppVersion.intValue());
                            while (i11 >= 0 && iArr[i11] > fbAppVersion.intValue()) {
                                i11--;
                            }
                            if (i11 >= 0) {
                                if (iArr[i11] == fbAppVersion.intValue()) {
                                    if (i11 % 2 == 0) {
                                        iMin = Math.min(iMax, iIntValue);
                                        break;
                                    }
                                }
                            }
                        }
                        iMin = -1;
                        break;
                        break;
                    }
                }
                iMin = -1;
                break;
                if (iMin != -1) {
                    fVar = new f();
                    fVar.f44920a = iMin;
                }
            }
            fVar = new f();
            fVar.f44920a = -1;
        }
        return fVar.f44920a;
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TreeSet<Integer> f44919a;

        /* JADX WARN: Code duplicated, block: B:11:0x001a A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x0022, B:14:0x0026, B:16:0x002c, B:11:0x001a), top: B:21:0x0003 }] */
        public final synchronized void a(boolean z10) {
            if (z10) {
                this.f44919a = m.a(m.f44914a, this);
            } else {
                try {
                    TreeSet<Integer> treeSet = this.f44919a;
                    if (treeSet == null || !i.a(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                        this.f44919a = m.a(m.f44914a, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            TreeSet<Integer> treeSet2 = this.f44919a;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                e();
            }
        }

        public abstract String b();

        public abstract String c();

        public String d() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void e() {
        }
    }
}
