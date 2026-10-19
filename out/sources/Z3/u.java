package Z3;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: GraphRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u implements r.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f7894a;

    public u(ArrayList<String> arrayList) {
        this.f7894a = arrayList;
    }

    @Override // Z3.r.e
    public final void a(String str, String value) throws IOException {
        kotlin.jvm.internal.i.e(value, "value");
        this.f7894a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(value, "UTF-8")}, 2)));
    }
}
