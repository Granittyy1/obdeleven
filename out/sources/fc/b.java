package fc;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import okhttp3.r;
import okhttp3.y;
import p318zb.C2839f;
import p318zb.C2839f.c;
import retrofit2.h;

/* JADX INFO: compiled from: GsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h<T, y> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f35075d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f35076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeAdapter<T> f35077c;

    static {
        Pattern pattern = r.f45588d;
        f35075d = r.a.a("application/json; charset=UTF-8");
    }

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f35076b = gson;
        this.f35077c = typeAdapter;
    }

    @Override // retrofit2.h
    public final y b(Object obj) throws IOException {
        C2839f c2839f = new C2839f();
        M7.b bVarG = this.f35076b.g(new OutputStreamWriter(c2839f.new c(), StandardCharsets.UTF_8));
        this.f35077c.write(bVarG, obj);
        bVarG.close();
        return y.create(f35075d, c2839f.R(c2839f.f49074c));
    }
}
