package F6;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.node.C1188i;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TreeSet;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p191p5.InterfaceC2756b;

/* JADX INFO: compiled from: CachedSettingsIo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements p191p5.e, p191p5.d, InterfaceC2756b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3259c;

    public a(int i10) {
        this.f3258b = i10;
        switch (i10) {
            case 3:
                this.f3259c = new TreeSet(C1188i.f14586a);
                break;
            case 4:
                this.f3259c = new HashMap();
                break;
            case 5:
                this.f3259c = new CountDownLatch(1);
                break;
            case 6:
                break;
            default:
                this.f3259c = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    public static a e(Uri uri, Uri uri2) {
        a aVar = new a(6);
        Intent intent = new Intent();
        aVar.f3259c = intent;
        intent.setData(uri);
        intent.putExtra("output", uri2);
        return aVar;
    }

    public void a(LayoutNode layoutNode) {
        if (!layoutNode.c()) {
            R.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((TreeSet) this.f3259c).add(layoutNode);
    }

    @Override // p191p5.InterfaceC2756b
    public void b() {
        ((CountDownLatch) this.f3259c).countDown();
    }

    public float c(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.f3259c;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    @Override // p191p5.d
    public void d(Exception exc) {
        ((CountDownLatch) this.f3259c).countDown();
    }

    public JSONObject f() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = (File) this.f3259c;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        CommonUtils.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    jSONObject = null;
                }
                CommonUtils.b(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.b(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.b(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public boolean g(LayoutNode layoutNode) {
        if (!layoutNode.c()) {
            R.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((TreeSet) this.f3259c).remove(layoutNode);
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f3259c).countDown();
    }

    public String toString() {
        switch (this.f3258b) {
            case 3:
                return ((TreeSet) this.f3259c).toString();
            default:
                return super.toString();
        }
    }

    public a(Object obj) {
        this.f3258b = 2;
        this.f3259c = obj;
    }

    public a(D6.f fVar) {
        this.f3258b = 0;
        this.f3259c = new File(fVar.f2815b, "com.crashlytics.settings.json");
    }
}
