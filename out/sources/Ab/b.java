package Ab;

/* JADX INFO: compiled from: JoinPointImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.aspectj.lang.a f1050d;

    /* JADX INFO: compiled from: JoinPointImpl.java */
    public static class a implements org.aspectj.lang.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f1052b;

        public final String toString() {
            e eVar = e.f1063f;
            StringBuffer stringBuffer = new StringBuffer();
            String strSubstring = this.f1051a;
            int iLastIndexOf = strSubstring.lastIndexOf(45);
            if (iLastIndexOf != -1) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
            stringBuffer.append(strSubstring);
            stringBuffer.append("(");
            stringBuffer.append(this.f1052b.b());
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
    }

    public b(org.aspectj.lang.a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f1050d = aVar;
        this.f1047a = obj;
        this.f1048b = obj2;
        this.f1049c = objArr;
    }

    public final String toString() {
        return ((a) this.f1050d).toString();
    }
}
