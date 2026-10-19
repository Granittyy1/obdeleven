package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;

    public HttpException(v<?> vVar) {
        StringBuilder sb2 = new StringBuilder("HTTP ");
        okhttp3.z zVar = vVar.f46822a;
        int i10 = zVar.f45683e;
        sb2.append(i10);
        sb2.append(" ");
        String str = zVar.f45682d;
        sb2.append(str);
        super(sb2.toString());
        this.code = i10;
        this.message = str;
    }
}
