package com.parse;

import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import okhttp3.A;
import okhttp3.o;
import okhttp3.r;
import okhttp3.t;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p318zb.InterfaceC2840g;

/* JADX INFO: loaded from: classes3.dex */
class ParseHttpClient {
    private boolean hasExecuted;
    private t okHttpClient;

    /* JADX INFO: renamed from: com.parse.ParseHttpClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$parse$http$ParseHttpRequest$Method;

        static {
            int[] iArr = new int[ParseHttpRequest.Method.values().length];
            $SwitchMap$com$parse$http$ParseHttpRequest$Method = iArr;
            try {
                iArr[ParseHttpRequest.Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class ParseOkHttpRequestBody extends y {
        private ParseHttpBody parseBody;

        public ParseOkHttpRequestBody(ParseHttpBody parseHttpBody) {
            this.parseBody = parseHttpBody;
        }

        @Override // okhttp3.y
        public long contentLength() {
            return this.parseBody.getContentLength();
        }

        @Override // okhttp3.y
        public r contentType() {
            if (this.parseBody.getContentType() == null) {
                return null;
            }
            String contentType = this.parseBody.getContentType();
            Pattern pattern = r.f45588d;
            return r.a.b(contentType);
        }

        @Override // okhttp3.y
        public void writeTo(InterfaceC2840g interfaceC2840g) throws IOException {
            this.parseBody.writeTo(interfaceC2840g.U0());
        }
    }

    public ParseHttpClient(t.a aVar) {
        this.okHttpClient = new t(aVar == null ? new t.a() : aVar);
    }

    public static ParseHttpClient createClient(t.a aVar) {
        return new ParseHttpClient(aVar);
    }

    public final ParseHttpResponse execute(ParseHttpRequest parseHttpRequest) throws IOException {
        if (!this.hasExecuted) {
            this.hasExecuted = true;
        }
        return executeInternal(parseHttpRequest);
    }

    public ParseHttpResponse executeInternal(ParseHttpRequest parseHttpRequest) throws IOException {
        return getResponse(this.okHttpClient.a(getRequest(parseHttpRequest)).k());
    }

    public u getRequest(ParseHttpRequest parseHttpRequest) {
        u.a aVar = new u.a();
        ParseHttpRequest.Method method = parseHttpRequest.getMethod();
        int i10 = AnonymousClass1.$SwitchMap$com$parse$http$ParseHttpRequest$Method[method.ordinal()];
        if (i10 == 1) {
            aVar.e("GET", null);
        } else if (i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalStateException("Unsupported http method " + method.toString());
        }
        aVar.g(parseHttpRequest.getUrl());
        o.a aVar2 = new o.a();
        for (Map.Entry<String, String> entry : parseHttpRequest.getAllHeaders().entrySet()) {
            aVar2.a(entry.getKey(), entry.getValue());
        }
        aVar.d(aVar2.e());
        ParseHttpBody body = parseHttpRequest.getBody();
        ParseOkHttpRequestBody body2 = body != null ? new ParseOkHttpRequestBody(body) : null;
        int i11 = AnonymousClass1.$SwitchMap$com$parse$http$ParseHttpRequest$Method[method.ordinal()];
        if (i11 == 2) {
            aVar.e("DELETE", body2);
        } else if (i11 == 3) {
            i.e(body2, "body");
            aVar.e("POST", body2);
        } else if (i11 == 4) {
            i.e(body2, "body");
            aVar.e("PUT", body2);
        }
        return aVar.a();
    }

    public ParseHttpResponse getResponse(z zVar) {
        int i10 = zVar.f45683e;
        A a10 = zVar.f45686h;
        InputStream inputStreamX0 = a10.h().X0();
        int iB = (int) a10.b();
        HashMap map = new HashMap();
        o oVar = zVar.f45685g;
        oVar.getClass();
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        i.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
        int size = oVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            treeSet.add(oVar.k(i11));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        i.d(setUnmodifiableSet, "unmodifiableSet(result)");
        for (String name : setUnmodifiableSet) {
            i.e(name, "name");
            map.put(name, z.c(name, zVar));
        }
        return new ParseHttpResponse.Builder().setStatusCode(i10).setContent(inputStreamX0).setTotalSize(iB).setReasonPhrase(zVar.f45682d).setHeaders(map).setContentType(a10.c() != null ? a10.c().f45590a : null).build();
    }
}
