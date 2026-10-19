package com.google.gson.internal.sql;

import M7.b;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28978b = new m() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f28979a;

    public /* synthetic */ SqlTimeTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Time read(M7.a aVar) throws IOException {
        Time time;
        if (aVar.y0() == JsonToken.j) {
            aVar.n0();
            return null;
        }
        String strR0 = aVar.r0();
        synchronized (this) {
            TimeZone timeZone = this.f28979a.getTimeZone();
            try {
                try {
                    time = new Time(this.f28979a.parse(strR0).getTime());
                    this.f28979a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strR0 + "' as SQL Time; at path " + aVar.B(), e10);
                }
            } catch (Throwable th) {
                this.f28979a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(b bVar, Time time) throws IOException {
        String str;
        Time time2 = time;
        if (time2 == null) {
            bVar.x();
            return;
        }
        synchronized (this) {
            str = this.f28979a.format((Date) time2);
        }
        bVar.j0(str);
    }

    private SqlTimeTypeAdapter() {
        this.f28979a = new SimpleDateFormat("hh:mm:ss a");
    }
}
