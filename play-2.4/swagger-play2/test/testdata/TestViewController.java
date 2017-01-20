package testdata;

import io.swagger.annotations.*;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

@Api(value = "/apitest/testView", description = "test a view object with object maps")
public class TestViewController extends Controller {
    @ApiOperation(
            value = "Testing java Object representation in the swagger file",
            notes = "Returns TestView",
            httpMethod = "GET",
            produces = "application/json",
            nickname = "testView"
    )
    @ApiResponses({
            @ApiResponse(code = Http.Status.OK, message = "The view is returned"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testView", value = "TestView object", required = true, dataType = "testdata.TestView", paramType = "body")})
    public Result list() {
        return ok();
    }
}
