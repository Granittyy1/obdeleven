package p220r9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: IntentUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f46509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46510c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46511d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46512e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46513f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f46514g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f46515h = "";

    public z(Context context) {
        this.f46508a = context;
    }

    public final Intent a() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Uri uri = this.f46509b;
        if (uri != null) {
            arrayList.add(uri);
        }
        String str = arrayList.size() == 0 ? "android.intent.action.SENDTO" : "android.intent.action.SEND_MULTIPLE";
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        Intent intent2 = new Intent(str);
        intent2.setSelector(intent);
        intent2.putExtra("android.intent.extra.EMAIL", new String[]{this.f46510c});
        StringBuilder sb2 = new StringBuilder();
        if (!this.f46515h.isEmpty()) {
            sb2.append(this.f46515h);
            sb2.append(" ");
        }
        if (!this.f46513f.isEmpty()) {
            sb2.append(this.f46513f);
            sb2.append(" ");
        }
        if (!this.f46514g.isEmpty()) {
            sb2.append(this.f46514g);
            sb2.append(" ");
        }
        intent2.putExtra("android.intent.extra.SUBJECT", sb2.toString());
        intent2.putExtra("android.intent.extra.TEXT", this.f46512e);
        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        return Intent.createChooser(intent2, this.f46511d);
    }

    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        this.f46512e = str;
    }

    public final void c(int i10) {
        this.f46511d = this.f46508a.getString(i10);
    }
}
