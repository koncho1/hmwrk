package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/albums/1", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/albums/_put/rq.json")
@ResponseTemplatePath(path = "api/albums/_put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutAlbumMethod extends AbstractApiMethodV2 {


    public PutAlbumMethod() {

        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
