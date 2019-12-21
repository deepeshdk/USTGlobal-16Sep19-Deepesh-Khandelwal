import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(getAllStudentsApprovedBook, search: string) {
    if (!search) {
      return getAllStudentsApprovedBook;
    }
    return getAllStudentsApprovedBook.filter(val => val.sid == search);
  }

  // transfrom(getAllBookReturnedDetails, search: string) {
  //   if (!search) {
  //     return getAllBookReturnedDetails;
  //   }
  //   return getAllBookReturnedDetails.filter(val => val.sid == search);
  // }

}
