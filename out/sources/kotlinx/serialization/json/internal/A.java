package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends z {
    @Override // kotlinx.serialization.json.internal.z
    public final boolean b() {
        char cCharAt;
        int iV = v();
        String str = this.f44038e;
        return (iV >= str.length() || iV == -1 || (cCharAt = str.charAt(iV)) == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
    }

    @Override // kotlinx.serialization.json.internal.z
    public final byte e() {
        int iV = v();
        String str = this.f44038e;
        if (iV >= str.length() || iV == -1) {
            return (byte) 10;
        }
        this.f44034a = iV + 1;
        return C.e.h(str.charAt(iV));
    }

    @Override // kotlinx.serialization.json.internal.z
    public final void g(char c10) {
        int iV = v();
        String str = this.f44038e;
        if (iV >= str.length() || iV == -1) {
            this.f44034a = -1;
            y(c10);
            throw null;
        }
        char cCharAt = str.charAt(iV);
        this.f44034a = iV + 1;
        if (cCharAt == c10) {
            return;
        }
        y(c10);
        throw null;
    }

    @Override // kotlinx.serialization.json.internal.z
    public final byte s() {
        int iV = v();
        String str = this.f44038e;
        if (iV >= str.length() || iV == -1) {
            return (byte) 10;
        }
        this.f44034a = iV;
        return C.e.h(str.charAt(iV));
    }

    @Override // kotlinx.serialization.json.internal.z
    public final int v() {
        int i10;
        int iP = this.f44034a;
        if (iP == -1) {
            return iP;
        }
        while (true) {
            String str = this.f44038e;
            if (iP >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(iP);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iP + 1) >= str.length()) {
                    break;
                }
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '*') {
                    int iQ = kotlin.text.n.Q(str, "*/", iP + 2, false, 4);
                    if (iQ == -1) {
                        this.f44034a = str.length();
                        z.n(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    iP = iQ + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iP = kotlin.text.n.P(str, '\n', iP + 2, false, 4);
                    if (iP == -1) {
                        iP = str.length();
                    }
                }
            }
            iP++;
        }
        this.f44034a = iP;
        return iP;
    }
}
