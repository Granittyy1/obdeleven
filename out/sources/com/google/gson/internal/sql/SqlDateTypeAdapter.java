package com.google.gson.internal.sql;

import M7.b;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28976b = new m() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f28977a;

    public /* synthetic */ SqlDateTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Date read(M7.a aVar) throws IOException {
        Date date;
        if (aVar.y0() == JsonToken.j) {
            aVar.n0();
            return null;
        }
        String strR0 = aVar.r0();
        synchronized (this) {
            TimeZone timeZone = this.f28977a.getTimeZone();
            try {
                try {
                    date = new Date(this.f28977a.parse(strR0).getTime());
                    this.f28977a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strR0 + "' as SQL Date; at path " + aVar.B(), e10);
                }
            } catch (Throwable th) {
                this.f28977a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(b bVar, Date date) throws IOException {
        String str;
        Date date2 = date;
        if (date2 == null) {
            bVar.x();
            return;
        }
        synchronized (this) {
            str = this.f28977a.format((java.util.Date) date2);
        }
        bVar.j0(str);
    }

    private SqlDateTypeAdapter() {
        this.f28977a = new SimpleDateFormat("MMM d, yyyy");
    }
}
