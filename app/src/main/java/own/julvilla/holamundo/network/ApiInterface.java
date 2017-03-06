package own.julvilla.holamundo.network;

import java.util.List;

import own.julvilla.holamundo.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Usuario on 03-03-2017.
 */

public interface ApiInterface {

    @GET("inbox.json")
    public Call<List<Message>> getInbox();

}