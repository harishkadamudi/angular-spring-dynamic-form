/**
 * Pipes module
 * Created by Harish Kadamudi on 11/11/2016.
 */
import { NgModule }      from '@angular/core';

import {ValuesPipe} from './values.pipe';

@NgModule({
    declarations: [ ValuesPipe  ],
    exports: [ValuesPipe]
})
export class PipesModule { }
