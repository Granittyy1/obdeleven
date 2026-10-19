package fc;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.A;
import okhttp3.r;
import p318zb.InterfaceC2841h;
import retrofit2.h;

/* JADX INFO: compiled from: GsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c<T> implements h<A, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f35078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeAdapter<T> f35079c;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f35078b = gson;
        this.f35079c = typeAdapter;
    }

    @Override // retrofit2.h
    public final Object b(A a10) throws IOException {
        Charset charsetA;
        A a11 = a10;
        A.a aVar = a11.f45270b;
        if (aVar == null) {
            InterfaceC2841h interfaceC2841hH = a11.h();
            r rVarC = a11.c();
            if (rVarC == null || (charsetA = rVarC.a(kotlin.text.a.f43120b)) == null) {
                charsetA = kotlin.text.a.f43120b;
            }
            aVar = new A.a(interfaceC2841hH, charsetA);
            a11.f45270b = aVar;
        }
        this.f35078b.getClass();
        M7.a aVar2 = new M7.a(aVar);
        aVar2.f4589c = Strictness.f28813c;
        try {
            T t8 = this.f35079c.read(aVar2);
            if (aVar2.y0() != JsonToken.f28995k) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            a11.close();
            return t8;
        } catch (Throwable th) {
            a11.close();
            throw th;
        }
    }
}
